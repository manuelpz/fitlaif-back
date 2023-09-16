package com.gym.fitlaif.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.fitlaif.domain.EjerciciosPersonalizados;
import com.gym.fitlaif.dto.EjerciciosPersonalizadosDTO;
import com.gym.fitlaif.dto.SeriesRepeticionesYPrDTO;
import com.gym.fitlaif.service.EjerciciosPersonalizadosService;

@CrossOrigin
@RestController
@RequestMapping("/ejerciciosPersonalizados")
public class EjerciciosPersonalizadosController {

	@Autowired
	EjerciciosPersonalizadosService ejerciciosService;
	
	@GetMapping("/{id}")
	private EjerciciosPersonalizadosDTO obtenerEjercicios(@PathVariable String id) throws Exception {
		return ejerciciosService.obtenerEjercicios(id);
	}
	
	@GetMapping("/seriesRepeticiones/{id}")
	private SeriesRepeticionesYPrDTO obtenerSeriesYRepeticiones(@PathVariable String id) throws Exception {
		return ejerciciosService.obtenerSeriesYRepeticiones(id);
	}
	
	@GetMapping
	private List<EjerciciosPersonalizadosDTO> obtenerTodosLosEjercicios() throws Exception{
		return ejerciciosService.obtenerTodosLosEjercicios();
	}
	
	@PutMapping("/actualizar")
	private EjerciciosPersonalizadosDTO actualizarEjercicio(@RequestBody EjerciciosPersonalizados ejercicio) throws Exception {
		return ejerciciosService.actualizarEjercicio(ejercicio);
	}
}
