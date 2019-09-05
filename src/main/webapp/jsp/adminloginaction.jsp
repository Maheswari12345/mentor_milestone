<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html >
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>Add New company</title>
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
        <div class="header">


                MENTOR ON DEMAND  <img src="images/logo.png" id="logo">
            
            </div>
<div class="navbar">
        <ul class="ul"> 
                <li class="li"><a href="/studentslist" class="hyperlink">Students List</a></li>
                <li class="li"><a href="/courseslist" class="hyperlink">Manage Courses</a></li>
                <li class="li"><a href="/mentorlist" class="hyperlink">Mentor list</a></li>
              
                <li class="floatright-list"><a href="https://www.google.com" class="hyperlink">Logout</a></li>
        </ul>
        
</div>
<div class="container-addcompany"> 
<h3 class="addcompany-heading">ADD COURSES</h3>
<div class="addcompany">
    
    <h1>hii</h1>
     <%
           String username=request.getParameter("username");

     String password=request.getParameter("password");
     String admin=request.getParameter("admin");
     
           
           try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/mentor_on_demand";
                Connection conn = DriverManager.getConnection(url, "root", "root");
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from user where username='" + username + "'");
               
                int status=0;
                if(rs.next())
                {
                   
                     if(password.equals(rs.getString(6)))
                     {
                        
                           response.sendRedirect("/courseslist");
                     }
                     
                     else
                     {
                    	 out.println("Invalid Attempt!!!");
                     }
                }
                else
                {
                     out.println("Invalid User!!");
                }
                
                rs.close();
                
                stmt.close();
                conn.close();
                     
           } catch (Exception e) {
                out.println(e.getMessage());
           }
           
     %>
   
    
    
</body>
</html>
