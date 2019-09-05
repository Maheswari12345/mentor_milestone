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


                MENTOR ON DEMAND  <img src="images/mentorlogo.jpg" id="logo">
            
            </div>
<div class="navbar">
        
        
</div>
<div class="container-addcompany"> 
<h3 class="addcompany-heading">STUDENT LOGIN</h3>
<div class="addcompany">
    <form:form method="POST" action="/login"
  modelAttribute="login">
        <table cellspacing="10px" width="60%">
            <tr>
             
             <td ><label for="username">User Name</label></td>
            
             <td ><form:input type="text" id="user_name" name="user_name" path="username"/></td>
            </tr>
              <tr>
             
             
            
               <td ><label for="password">Password</label></td>
            
             <td ><form:input type="password" id="password" name="password" path="password"/></td>
            </tr>
             
           
        </table>
   
</div>
<div class="savebutton">
        <input type="submit" value="LOGIN" name="ok" width="30px" class="buttonconfirm">
        </div>  
    </div>
     </form:form>
    
    
</body>
</html>
