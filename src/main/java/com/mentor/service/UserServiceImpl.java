package com.mentor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.dao.Logindao;
import com.mentor.dao.Userdao;
import com.mentor.model.Login;
import com.mentor.model.User;

@Service(value="UserService")
public class UserServiceImpl implements UserService{
@Autowired Userdao udao;
@Autowired Logindao ldao;
	@Override
	public User insertstudent(User user) {
		// TODO Auto-generated method stub
		return udao.save(user);
	}

	@Override
	public List<User> getstudentslist() throws Exception {
		
		return udao.findAll();
	}

	@Override
	public Login insertlogin(Login login) {
		// TODO Auto-generated method stub
		return ldao.save(login );
	}

	@Override
	public List<Login> getloginlist() throws Exception {
		// TODO Auto-generated method stub
		return ldao.findAll();
	}

}
