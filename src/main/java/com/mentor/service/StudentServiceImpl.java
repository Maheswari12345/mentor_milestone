package com.mentor.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Service;

import com.mentor.model.Student;

@Service(value="StudnetService")
public class StudentServiceImpl implements StudentService{
	public static Connection connect() throws Exception {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mentor_on_demand", "root", "root");

		return conn;

	}


	@Override
	public int insertuser(Student s) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = connect();
		String insertQuery = "insert into student(username) values (?)";

		PreparedStatement pstmt = conn.prepareStatement(insertQuery);

		pstmt.setString(1, s.getUsername());
		

		int insertstatus = 0;
		insertstatus = pstmt.executeUpdate();

		return insertstatus;

	}


}
