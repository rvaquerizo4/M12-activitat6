package net.jaumebalmes.rvaquerizo.controladors;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.jaumebalmes.rvaquerizo.entitats.Course;
import net.jaumebalmes.rvaquerizo.repositoris.course_repositori;



@RestController
@RequestMapping("activitat6")
public class course_controlador {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	course_repositori courseRep; //no cal fer new ja que ho fa Spring

	
	@GetMapping("course")
	public List<Course> getCourse() {
		List<Course> course1 = courseRep.findAll();
		return course1;
		
	}
	@GetMapping("course/{id}")
	public Course getCourse(@PathVariable long id) {
		Course course2 = courseRep.findById(id).get();

		return course2;
	}
}
