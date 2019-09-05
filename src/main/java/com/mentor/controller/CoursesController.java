package com.mentor.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mentor.model.Courses;
import com.mentor.service.CoursesService;

@Controller
public class CoursesController {
	@Autowired
	CoursesService cservice;
	@RequestMapping(path="/courseslist")
	public ModelAndView getcourseslist() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("courseslist");
		mv.addObject("courseslist",cservice.getcourseslist());
		return mv;
	}
	
	@RequestMapping(path="/addcourses", method= RequestMethod.POST)
	public String addcourses(Courses courses) throws SQLException
	{   System.out.println(courses);
		cservice.save(courses);
		return "redirect:/courseslist" ;
		
	}
	@RequestMapping(path="/addcourses",method=RequestMethod.GET)
	public String addcoursesGet(ModelMap  model)throws SQLException
	{
		Courses courses=new Courses();
		model.addAttribute("courses",courses);
		return "addcourses";
	}
	
	
	

}
