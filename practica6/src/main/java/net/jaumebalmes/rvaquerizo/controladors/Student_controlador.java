package net.jaumebalmes.rvaquerizo.controladors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.rvaquerizo.entitats.Student;
import net.jaumebalmes.rvaquerizo.repositoris.Student_repositori;

@RestController
@RequestMapping("activitat6")
public class Student_controlador {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	Student_repositori studentRep; //no cal fer new ja que ho fa Spring
	
	@GetMapping("student")
	public List<Student> getStudent() {
		List<Student> student1 = studentRep.findAll();
		return student1;
		
	}
	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable long id) {
		Student student2 = studentRep.findById(id).get();

		return student2;
	}
	
	//Metodo para eliminar por Id
	@DeleteMapping("student/delete/{id}")
	public void deletePost(@PathVariable Long id) {
		studentRep.deleteById(id);

	}
}
