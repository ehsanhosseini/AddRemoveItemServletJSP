package com.webapp.login;

public class LoginService {

	
	public boolean isUserValid(String user, String password) {
		
		if(user.equals("Ehsan") && password.equals("123456")) {
			return true;
		}
		return false;
	}
}
