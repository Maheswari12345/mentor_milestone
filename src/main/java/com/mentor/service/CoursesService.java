package com.mentor.service;

import java.util.List;

import com.mentor.model.Courses;

public interface CoursesService {
	public Courses save(Courses courses);

	List<Courses> getcourseslist() throws Exception;

}
