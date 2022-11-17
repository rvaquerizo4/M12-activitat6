package net.jaumebalmes.rvaquerizo.entitats;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include()
	private long id;
	
	private String lastName;
	private String firstName;
	private LocalDate birthDate;
	private boolean wantsNewsletter;
	
	@ManyToMany(cascade = {	
			CascadeType.PERSIST, 
			CascadeType.MERGE})
	@JoinTable(name = "course",
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id")
	)
	private ArrayList<Course> course = new ArrayList<>();
	
    public void addCourse(Course courses) {
    	course.add(courses);
        courses.getStudent().add(this);
    }
    
    public void removeCourse(Course courses) {
        Course.remove(courses);
        courses.getStudent().remove(this);
    }
	
	
	
	public Student() {
		
	}
	public Student(long id, String lastName, String firstName, LocalDate birthDate, boolean wantsNewsletter,
			ArrayList<Course> course) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.wantsNewsletter = wantsNewsletter;
		this.course = course;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isWantsNewsletter() {
		return wantsNewsletter;
	}

	public void setWantsNewsletter(boolean wantsNewsletter) {
		this.wantsNewsletter = wantsNewsletter;
	}

	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", birthDate=" + birthDate
				+ ", wantsNewsletter=" + wantsNewsletter + ", course=" + course + "]";
	}
	
	
	

}
