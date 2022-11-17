package net.jaumebalmes.rvaquerizo.repositoris;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.rvaquerizo.entitats.Course;


public interface Student_repositori extends JpaRepository<Course, Long>{

	public List<Course> findAll();

}
