package com.mentor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.dao.Mentordao;
import com.mentor.model.Mentor;

@Service(value="MentorService")
public class MentorServiceImpl implements MentorService{

	@Autowired
	Mentordao mdao;
	
	@Override
	public Mentor insertmentors(Mentor mentor) {
	
		return mdao.save(mentor);
	}

	@Override
	public List<Mentor> getmentorslist() throws Exception {

		return mdao.findAll();
	}

	@Override
	public void deletementor(Integer id) {
	mdao.deleteById(id);
		
	}

	

}
