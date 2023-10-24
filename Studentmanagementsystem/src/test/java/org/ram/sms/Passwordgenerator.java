package org.ram.sms;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passwordgenerator {

	public static void main(String[] args) {

BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
String rawpassword="riya";
String encodedpassword=encoder.encode(rawpassword);
System.out.println(encodedpassword);
	}

}
