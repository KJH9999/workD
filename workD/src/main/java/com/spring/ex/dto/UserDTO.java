package com.spring.ex.dto;

public class UserDTO {
	private String email;
	private String pw;
	private String name;
	private String number;
	private String gender;
	private String birth_date;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	@Override
	public String toString() {
		return "UserDTO [email=" + email + ", pw=" + pw + ", name=" + name + ", number=" + number + ", gender=" + gender
				+ ", birth_date=" + birth_date + "]";
	}



}
