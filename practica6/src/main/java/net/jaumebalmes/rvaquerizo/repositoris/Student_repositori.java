package net.jaumebalmes.rvaquerizo.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.rvaquerizo.entitats.Course;


public interface Student_repositori extends CrudRepository<Course, Long>{

	public List<Course> findAll();

}
