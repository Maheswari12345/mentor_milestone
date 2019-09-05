package com.mentor.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor")
public class Mentor {
 @Id
 @Column(name="register_id")
 private int registerId;
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
@Column(name="mentor_name")
private String mentorName;
public String getMentorName() {
	return mentorName;
}
public void setMentorName(String mentorName) {
	this.mentorName = mentorName;
}
@Column(name="login_id")
private long loginId;
public long getLoginId() {
	return loginId;
}
public void setLoginId(long loginId) {
	this.loginId = loginId;
}
@Column(name="course_name")
 private String courseName;
 @Column(name="duration")
 private int duration;
 @Column(name="trainings_count")
 private int trainingCount;
 @Column(name="fees")
 private BigDecimal fees;
 @Column(name="student_name")
 private String studentName;
 @Column(name="rating")
 private BigDecimal rating;
 @Column(name="password")
 private String password;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getRegisterId() {
	return registerId;
}
public void setRegisterId(int registerId) {
	this.registerId = registerId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public int getTrainingCount() {
	return trainingCount;
}
public void setTrainingCount(int trainingCount) {
	this.trainingCount = trainingCount;
}
public BigDecimal getFees() {
	return fees;
}
public void setFees(BigDecimal fees) {
	this.fees = fees;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public BigDecimal getRating() {
	return rating;
}
public void setRating(BigDecimal rating) {
	this.rating = rating;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
 
@Override
public String toString() {
	return "Mentor [registerId=" + registerId + ", id=" + id + ", mentorName=" + mentorName + ", loginId=" + loginId
			+ ", courseName=" + courseName + ", duration=" + duration + ", trainingCount=" + trainingCount + ", fees="
			+ fees + ", studentName=" + studentName + ", rating=" + rating + ", password=" + password + "]";
}
 
 
	
	
	

}
