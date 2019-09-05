package com.mentor.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="s_id")
	private int sId;
	@Column(name="admin")
	private String admin;
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	
	@Column(name="register_id")
	private int registerId;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="admin_id")
	private String adminId;
	@Column(name="email")
	private String email;
	 @Column(name="rating")
	 private BigDecimal rating;
	 @Column(name="login_id")
	 private long loginId;
	public BigDecimal getRating() {
		return rating;
	}
	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
	public long getLoginId() {
		return loginId;
	}
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}
	public int getRegisterId() {
		return registerId;
	}
	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [sId=" + sId + ", admin=" + admin + ", registerId=" + registerId + ", username=" + username
				+ ", password=" + password + ", adminId=" + adminId + ", email=" + email + ", rating=" + rating
				+ ", loginId=" + loginId + "]";
	}
	
	
	
	
	

}
