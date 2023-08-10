package com.warrior;


import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@NotNull(message="last name can not be null!")
	@NotEmpty(message="last name can not be empty!")
	@Size(min=3,max=50)
	private String name;
	@NotEmpty
	@Email(message = "please enter the valid e-mail address")
	private String email;
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
	
	@NotBlank
	private String gender;
	
	@NotNull(message="please enter the birth date!")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date birthday;
	
	@Size(min=20,max=100)
	private String note;
	
	@NotBlank
	private String profession;
	
	@AssertTrue
	private boolean married;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", birthday=" + birthday + ", note=" + note + ", profession=" + profession + ", married=" + married
				+ "]";
	}
	
	

}
