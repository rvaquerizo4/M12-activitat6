package net.jaumebalmes.rvaquerizo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.jaumebalmes.rvaquerizo.entitats.Course;
import net.jaumebalmes.rvaquerizo.entitats.Student;
import net.jaumebalmes.rvaquerizo.repositoris.Student_repositori;

@Service
@RequiredArgsConstructor
public class Student_service {
	private final Student_repositori studentRep = null;

    public List<Course> findAll() {

        return studentRep.findAll();
    }

    public Course findById(Long id) {

        return studentRep.findById(id).orElseThrow();
    }
    
    public void delete(Course student) {
        
    	studentRep.delete(student);
    }

}



    
