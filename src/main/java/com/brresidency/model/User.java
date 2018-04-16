package com.brresidency.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="master_user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private int userId;
	@Column
	private String userName;
	
	@Column
	private String address;
	
	@Column
	private String mobileNumber;
	
	@Column
	private String eMail;
	
	
	public User() {
		super();
	}
	public User(int userId, String userName, String address, String mobileNumber, String eMail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.eMail = eMail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", mobileNumber="
				+ mobileNumber + ", eMail=" + eMail + "]";
	}
	
	
}
