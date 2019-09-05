package com.mentor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mentor.dao.Coursesdao;
import com.mentor.model.Courses;

@Service(value="CoursesService")
public class CoursesServiceImpl implements CoursesService{
	@Autowired
	Coursesdao cdao;

	@Override
	public Courses save(Courses courses) {
		
		return cdao.save(courses);
	}
	/*
	 *  @Override
    public User save(User user) {
	    User newUser = new User();
	    newUser.setUsername(user.getUsername());
	   
	    newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
	
        return user;
    }
	 */
	@Override
	public List<Courses> getcourseslist() throws Exception {
		return cdao.findAll();
	}
	


}
