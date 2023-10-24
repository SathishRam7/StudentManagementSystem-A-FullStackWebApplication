package org.ram.sms.repositary;

import org.ram.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositary extends JpaRepository<Student, Integer> {

	
	
}
