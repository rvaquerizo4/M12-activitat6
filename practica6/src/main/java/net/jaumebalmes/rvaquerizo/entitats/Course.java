package net.jaumebalmes.rvaquerizo.entitats;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
public class Course {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		private String title;

		
		@OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
		@JsonIgnore
		private List<CourseMaterial> courseMaterial;
		
		@ManyToMany(mappedBy = "Student",fetch = FetchType.EAGER)
		@JsonIgnore
		private List<Student> Student;


		
		
		public Course() { //constructor sense arguments
		}

		public Course(String title) {
			super();
			this.title = title;
		}


		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		

		public List<CourseMaterial> getCourseMaterial() {
			return courseMaterial;
		}

		public void setCourseMaterial(List<CourseMaterial> courseMaterial) {
			this.courseMaterial = courseMaterial;
		}
		
		public void deleteMaterial(CourseMaterial m) {
			CourseMaterial.remove(m);
			m.setCourse(null);
		}

		@Override
		public String toString() {
			return "Course [id=" + id + ", title=" + title + ", courseMaterial=" + courseMaterial + "]";
		}

		
}