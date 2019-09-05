package com.mentor.service;

import java.util.List;

import com.mentor.model.Mentor;

public interface MentorService {
	public Mentor insertmentors(Mentor mentor);
	List<Mentor> getmentorslist() throws Exception;
	public void deletementor(Integer id);
	

}
