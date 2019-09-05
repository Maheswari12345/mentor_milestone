package com.mentor.service;

import java.util.List;

import com.mentor.model.*;

public interface UserService {
	public User insertstudent(User user);
	List<User> getstudentslist() throws Exception;
	public Login insertlogin(Login login);
	List<Login> getloginlist() throws Exception;
	

}
