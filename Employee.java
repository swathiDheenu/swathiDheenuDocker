package com.employee.employeeManagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue

	private int _emplId;
	private String _username;
	private String _password;
	private String _fullName;
	private String _emailId;
	private Date _dateOfBirth;
	private String _gender;
	private String _securityQuestion;
	private String _answer;
	
	

	public Employee() {
		
	}
	
	

	public Employee(int emplId, String username, String password, String fullName, String emailId, Date dateOfBirth,
			String gender, String securityQuestion, String answer) {
		super();
		this._emplId = emplId;
		this._username = username;
		this._password = password;
		this._fullName = fullName;
		this._emailId = emailId;
		this._dateOfBirth = dateOfBirth;
		this._gender = gender;
		this._securityQuestion = securityQuestion;
		this._answer = answer;
	}



	public int getEmplId() {
		return _emplId;
	}



	public void setEmplId(int _emplId) {
		this._emplId = _emplId;
	}



	public String getUsername() {
		return _username;
	}



	public void setUsername(String _username) {
		this._username = _username;
	}



	public String getPassword() {
		return _password;
	}



	public void setPassword(String _password) {
		this._password = _password;
	}



	public String getFullName() {
		return _fullName;
	}



	public void setFullName(String _fullName) {
		this._fullName = _fullName;
	}



	public String getEmailId() {
		return _emailId;
	}



	public void setEmailId(String _emailId) {
		this._emailId = _emailId;
	}



	public Date getDateOfBirth() {
		return _dateOfBirth;
	}



	public void setDateOfBirth(Date _dateOfBirth) {
		this._dateOfBirth = _dateOfBirth;
	}



	public String getGender() {
		return _gender;
	}



	public void setGender(String _gender) {
		this._gender = _gender;
	}



	public String getSecurityQuestion() {
		return _securityQuestion;
	}



	public void setSecurityQuestion(String _securityQuestion) {
		this._securityQuestion = _securityQuestion;
	}



	public String getAnswer() {
		return _answer;
	}



	public void setAnswer(String _answer) {
		this._answer = _answer;
	}



	
}
