package com.entity;

public class Student {
	private int id;
	private String FullName;
	private String dob;
	private String address;
	private String qualification;
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fullName, String dob, String address, String qualification, String email) {
		super();
		FullName = fullName;
		this.dob = dob;
		this.address = address;
		this.qualification = qualification;
		this.email = email;
	}

	public Student(int id, String fullName, String dob, String address, String qualification, String email) {
		super();
		this.id = id;
		FullName = fullName;
		this.dob = dob;
		this.address = address;
		this.qualification = qualification;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", FullName=" + FullName + ", dob=" + dob + ", address=" + address
				+ ", qualification=" + qualification + ", email=" + email + "]";
	}

}
