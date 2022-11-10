package net.jaumebalmes.rvaquerizo.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.rvaquerizo.entitats.CourseMaterial;


public interface CourseMaterial_repositori extends CrudRepository<CourseMaterial, Long>{

	public List<CourseMaterial> findAll();
}
