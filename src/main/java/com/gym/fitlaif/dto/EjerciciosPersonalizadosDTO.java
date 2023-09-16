package com.gym.fitlaif.dto;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class EjerciciosPersonalizadosDTO {
	private String ejercicio;
	private List<Integer> series;
	private List<Integer> repeticiones;
	private List<Integer> peso;
	private String usuario;
	private Integer pr;
}
