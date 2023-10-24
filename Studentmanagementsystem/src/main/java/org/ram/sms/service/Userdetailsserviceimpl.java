package org.ram.sms.service;

import org.ram.sms.entity.User;
import org.ram.sms.repositary.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class Userdetailsserviceimpl implements UserDetailsService{

	@Autowired
	private UserRepositary userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userrepo.getuserbyusername(username);
		if(user==null) {
			throw new UsernameNotFoundException("cant find dude");
		}
		return new Myuserdetails(user);
	}

}
