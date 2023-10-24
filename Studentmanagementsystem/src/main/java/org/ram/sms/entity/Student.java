package org.ram.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
     
     @Column(name = "first_name",nullable = false)
	private String firstname;
     
     @Column(name = "last_name")
	private String lastname;
     
     @Column(name = "department")
	private String department;
     
     @Column(name = "gmail")
	private String gmail;
	public Student() {}
	public Student( String firstname, String lastname, String department, String gmail) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.gmail = gmail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	
}
