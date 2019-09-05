<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html >
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>Add Mentor Details</title>
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
        <div class="header">


                MENTOR ON DEMAND  <img src="images/logo.png" id="logo">
            
            </div>
<div class="navbar">
        <ul class="ul"> 
                <li class="li"><a href="/studentslist" class="hyperlink">Students List</a></li>
                <li class="li"><a href="/listcourses" class="hyperlink">Manage Courses</a></li>
                <li class="li"><a href="/mentorlist" class="hyperlink">Mentor list</a></li>
              
                <li class="floatright-list"><a href="https://www.google.com" class="hyperlink">Logout</a></li>
        </ul>
        
</div>
<div class="container-addcompany"> 
<h3 class="addcompany-heading">MENTOR REGISTRATION</h3>
<div class="addcompany">
    <form:form method="POST" action="/addmentor"
  modelAttribute="mentor">
        <table cellspacing="10px" width="60%">
            <tr>
             
             <td ><label for="mentorName">Mentor Name</label></td>
            
             <td ><form:input type="text" id="mentor_name" name="mentor_name" path="mentorName"/></td>
            </tr>
              <tr>
             
             <td ><label for="Id"> Id</label></td>
            
             <td ><form:input type="text" name="id" path="registerId"/></td>
            </tr>
            <tr>
            
               <td ><label for="courseName">Technology</label></td>
            
             <td ><form:input type="text" id="courses_name" name="courses_name" path="courseName"/></td>
            </tr>
              <tr>
            
               <td ><label for="password">Password</label></td>
            
             <td ><form:input type="password" id="password" name="password" path="password"/></td>
            </tr>
             <tr>
            
               <td ><label for="duration">Course Duration</label></td>
            
             <td ><form:input type="text" id="duration" name="duration" path="duration"/></td>
            </tr>
            <tr>
            
               <td ><label for="fees">Fees</label></td>
            
             <td ><form:input type="text" id="fees" name="fees" path="fees"/></td>
            </tr>
             <tr>
            
               <td ><label for="traing_count">Completed training count</label></td>
            
             <td ><form:input type="text" id="training_count" name="training_count" path="trainingCount"/></td>
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
