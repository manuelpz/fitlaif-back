package com.gym.fitlaif.config;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

@Configuration
public class FirebaseConfig {
    
    @Bean
    public Firestore firestore() throws IOException {

        // Carga el archivo desde el classpath (dentro del JAR)
        InputStream serviceAccount = getClass().getResourceAsStream("/firebase-account-info.json");

        if (serviceAccount == null) {
            throw new IOException("No se pudo encontrar el archivo firebase-account-info.json en el classpath.");
        }

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp firebaseApp = FirebaseApp.initializeApp(options);
        return FirestoreClient.getFirestore(firebaseApp);
    }
}
