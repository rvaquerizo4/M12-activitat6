package net.jaumebalmes.rvaquerizo.controladors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.rvaquerizo.entitats.CourseMaterial;
import net.jaumebalmes.rvaquerizo.repositoris.CourseMaterial_repositori;



@RestController
@RequestMapping("activitat6/material")
public class CourseMaterial_controlador {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	CourseMaterial_repositori courseMaterialRep; //no cal fer new ja que ho fa Spring
	
	@GetMapping("courseMaterial")
	public List<CourseMaterial> getCourseMaterial() {
		List<CourseMaterial> course1 = courseMaterialRep.findAll();
		return course1;
	}
	
	@GetMapping("courseMaterial/{id}")
	public CourseMaterial getCourseMaterial(@PathVariable long id) {
		CourseMaterial course2 = courseMaterialRep.findById(id).get();

		return course2;
	}

}
