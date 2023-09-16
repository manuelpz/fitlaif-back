package com.gym.fitlaif.service;

import java.util.List;

import com.gym.fitlaif.domain.EjerciciosPersonalizados;
import com.gym.fitlaif.dto.EjerciciosPersonalizadosDTO;
import com.gym.fitlaif.dto.SeriesRepeticionesYPrDTO;

public interface EjerciciosPersonalizadosService {

	List<EjerciciosPersonalizadosDTO> obtenerTodosLosEjercicios() throws Exception;
	EjerciciosPersonalizadosDTO obtenerEjercicios(String id) throws Exception;
	EjerciciosPersonalizadosDTO actualizarEjercicio(EjerciciosPersonalizados ejercicio) throws Exception;
	SeriesRepeticionesYPrDTO obtenerSeriesYRepeticiones(String id) throws Exception;
}
