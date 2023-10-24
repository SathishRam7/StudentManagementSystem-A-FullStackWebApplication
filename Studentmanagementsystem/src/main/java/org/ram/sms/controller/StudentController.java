package org.ram.sms.controller;

import org.ram.sms.entity.Student;
import org.ram.sms.service.StudentService;
import org.ram.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
 
	@Autowired
	private StudentService studentservice;

	
	//handler method to handle list students and return model and view
@GetMapping("/")
	public String liststudent(Model model) {
		model.addAttribute("students", studentservice.getallstudents());
		return "students";
		
	}
@GetMapping("/students/new")
public String createstudentform(Model model) {
	Student student=new Student();
	model.addAttribute("student", student);
	return "createstudent";
}
@PostMapping("/students")
public String savestudent(@ModelAttribute("student") Student student) {
	studentservice.savestudent(student);
	return "redirect:/";
}
@GetMapping("/students/edit/{id}")
public String editstudentform(@PathVariable int id,Model model) {
	model.addAttribute("student", studentservice.getstudentbyid(id));
	return "editstudent";
	
}
@PostMapping("/students/{id}")
public String updatestudent(@PathVariable int id 
		,@ModelAttribute("student")Student student,Model model) {
	Student existingstudent=studentservice.getstudentbyid(id);
	existingstudent.setId(id);
	existingstudent.setFirstname(student.getFirstname());
	existingstudent.setLastname(student.getLastname());
	existingstudent.setDepartment(student.getDepartment());
	existingstudent.setGmail(student.getGmail());
	
	studentservice.updatestudent(existingstudent);
	return "redirect:/";
}

@GetMapping("students/delete/{id}")
public String deletestudent(@PathVariable int id) {
	studentservice.deletstudent(id);
	return "redirect:/";
}

@GetMapping("/403")
public String error403() {
	return "403";
}

}