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
public class SeriesRepeticionesYPrDTO {
	private List<SeriesRepeticionesDTO> seriesRepes;
	private Integer pr;
}
