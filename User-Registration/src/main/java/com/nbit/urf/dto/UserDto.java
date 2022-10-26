package com.nbit.urf.dto;

public class UserDto {
	
	private String username;
	private String password;
	private int age;
	private String location;
	private String email;

	public UserDto() {
		super();
	}

	public UserDto(String username, String password, int age, String location, String email) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.location = location;
		this.email = email;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
