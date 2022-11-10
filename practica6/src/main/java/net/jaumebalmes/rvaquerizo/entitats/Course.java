package net.jaumebalmes.rvaquerizo.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
public class Course {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		private String title;

		@JsonIgnore
		@OneToOne(mappedBy = "course")
		private CourseMaterial courseMaterial;

		
		
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
		

		
		
		 
		public CourseMaterial getCourseMaterial() {
			return courseMaterial;
		}

		public void setCourseMaterial(CourseMaterial courseMaterial) {
			this.courseMaterial = courseMaterial;
		}

		@Override
		public String toString() {
			return "Course [id=" + id + ", title=" + title + ", courseMaterial=" + courseMaterial + "]";
		}

		
}