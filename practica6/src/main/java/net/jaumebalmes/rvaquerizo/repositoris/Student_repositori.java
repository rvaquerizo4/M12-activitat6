package net.jaumebalmes.rvaquerizo.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.rvaquerizo.entitats.Student;

public interface Student_repositori extends CrudRepository<Student, Long>{
	
	public List<Student> findAll();

}
