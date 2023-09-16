package com.gym.fitlaif.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class SeriesRepeticionesDTO {
	private Integer series;
	private Integer repeticiones;
	private Integer peso;
}
