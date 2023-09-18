package com.gym.fitlaif.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.gym.fitlaif.dto.EjerciciosPersonalizadosDTO;
import com.gym.fitlaif.dto.SeriesRepeticionesDTO;
import com.gym.fitlaif.dto.SeriesRepeticionesYPrDTO;
@Repository
public class SeriesRepeticionesMapper {

	public SeriesRepeticionesYPrDTO toSeriesRepeticiones(EjerciciosPersonalizadosDTO ejercicio) {
	    ArrayList<SeriesRepeticionesDTO> seriesRepeticionesDTO = new ArrayList<SeriesRepeticionesDTO>();
	    SeriesRepeticionesYPrDTO seriesRepesPr = new SeriesRepeticionesYPrDTO();

	    List<Integer> series = ejercicio.getSeries();
	    List<Integer> repeticiones = ejercicio.getRepeticiones();
	    List<Integer> peso = ejercicio.getPeso();
	    Integer pr = ejercicio.getPr();

	    if(series != null && repeticiones != null) {
	    int size = Math.min(series.size(), repeticiones.size());
	    for (int index = 0; index < size; index++) {
	        SeriesRepeticionesDTO ser = new SeriesRepeticionesDTO();
	        ser.setSeries(series.get(index));
	        if(repeticiones.get(index) == null && peso.get(index) == null) {
	        	ser.setRepeticiones(null);
	        	ser.setPeso(null);
	        }
	        else {
	        ser.setRepeticiones(repeticiones.get(index));
	        ser.setPeso(peso.get(index));
	        }
	        seriesRepeticionesDTO.add(ser);
	    }
	    seriesRepesPr.setSeriesRepes(seriesRepeticionesDTO);
	    seriesRepesPr.setPr(pr);
	    }
	    return seriesRepesPr;
	}
}
