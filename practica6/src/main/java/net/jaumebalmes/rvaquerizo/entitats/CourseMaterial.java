package net.jaumebalmes.rvaquerizo.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class CourseMaterial {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_course;
	
	private String url;
	
	@OneToOne
	private Course course;
	
	
	
	public CourseMaterial() { //constructor sense arguments
	}
	
	public CourseMaterial(String url) {
		super();
		this.url = url;
	}
	
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public long getId_course() {
		return id_course;
	}

	public void setId_course(long id_course) {
		this.id_course = id_course;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "CourseMaterial [id_course=" + id_course + ", url=" + url + ", course=" + course + "]";
	}



	

}
