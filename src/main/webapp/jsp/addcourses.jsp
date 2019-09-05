<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <form:form method="POST" action="/addcourses"
  modelAttribute="courses">
        <table cellspacing="10px" width="60%">
            <tr>
             
             <td ><label for="coursesName">Course Name</label></td>
            
             <td ><form:input type="text" id="courses_name" name="courses_name" path="coursesName"/></td>
            </tr>
            
           
        </table>
   
</div>
<div class="savebutton">
        <input type="submit" value="save" name="ok" width="30px" class="buttonconfirm">
        </div>  
    </div>
     </form:form>
    
    
</body>
</html>
