package org.ram.sms.repositary;

import org.ram.sms.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepositary extends CrudRepository<User, Integer>{
	
	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getuserbyusername(@Param("username") String username);

}
