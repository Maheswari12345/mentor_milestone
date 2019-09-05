package com.mentor.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mentor.model.*;
import com.mentor.service.CoursesService;
import com.mentor.service.MentorService;
import com.mentor.service.StudentService;
import com.mentor.service.UserService;

@Controller
public class UserController {
	@Autowired 
	UserService uservice;
	@Autowired
	CoursesService cservice;
	@Autowired
	MentorService mservice;
	@Autowired
	StudentService sservice;
 
	@RequestMapping(path="/register",method=RequestMethod.GET)
	public String addcoursesGet(ModelMap  model)throws SQLException
	{
		User user=new User();
		model.addAttribute("user",user);
		return "registration";
	}
	@RequestMapping(path="/addstudent", method= RequestMethod.POST)
	public String addcourses(User user) throws SQLException
	{   System.out.println(user);
		uservice.insertstudent(user);
		return "redirect:/login" ;
		
	}
	
	/*@RequestMapping(path="/login")
	public ModelAndView getstudentlist() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		mv.addObject("login",uservice.getstudentslist());
		return mv;
	}*/
	@RequestMapping(path="/login")
	public String Login(ModelMap model)throws SQLException
	{
		Login login=new Login();
		model.addAttribute("login",login);
		return "login";
	}
	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public ModelAndView login() throws Exception
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("loginaction");
		return mv;
	}

	@RequestMapping(path="/adminlogin")
	public String adminLogin(ModelMap model)throws SQLException
	{
		Login login=new Login();
		model.addAttribute("adminlogin",login);
		return "adminlogin";
	}
	
	@RequestMapping(path="/adminlogin",method=RequestMethod.POST)
	public ModelAndView adminlogin() throws Exception
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("adminloginaction");
		return mv;
	
	}
	@RequestMapping(path="/indexpage")
    public String getindex(Model model) throws Exception
	{
		
		return "index";
	}
	@RequestMapping(path="/registerindex")
    public String getregister(Model model) throws Exception
	{
		
		return "registerindex";
	}
	@RequestMapping(value="/stucourseslist/{uname}")
	public ModelAndView getstudentcourseslist(@PathVariable String uname) throws Exception {
		 
		  		Student s=new Student();
		s.setUsername(uname);
		sservice.insertuser(s);
		System.out.println(uname);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("studentcourseslist");
		
		mv.addObject("mentorlist",mservice.getmentorslist());
		return mv;
	}
	
	
}
