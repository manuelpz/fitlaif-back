package com.gym.fitlaif.domain;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@Getter
@Setter
@NoArgsConstructor
public class EjerciciosPersonalizados {

	@Id
	private String ejercicio;
	private List<Integer> repeticiones;	
	private List<Integer> series;
	private List<Integer> peso;
	private String usuario;
	private Integer pr;
}
