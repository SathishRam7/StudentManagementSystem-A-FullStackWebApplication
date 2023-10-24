package org.ram.sms.service;

import java.util.List;

import org.ram.sms.entity.Student;
import org.ram.sms.repositary.StudentRepositary;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
	
	private StudentRepositary studentrepositary;
	public StudentService(StudentRepositary studentrepositary) {
		super();
		this.studentrepositary = studentrepositary;
	}


	

	public List<Student> getallstudents() {
		return studentrepositary.findAll();
		
		
	}



	public Student savestudent(Student student) {
return studentrepositary.save(student);
	}




	public Student getstudentbyid(int id) {
	
		return studentrepositary.findById(id).get();
	}




	public Student updatestudent(Student student) {
		return studentrepositary.save(student);
	}



	
	public void deletstudent(int id) {
		 studentrepositary.deleteById(id);
	}

}
