package com;

public class Course {

	private int couId;
	private String couName,couAddress,couTime,teacher;
	
	public Course(int couId,String couName,String couAddress,String couTime,String teacher){
		super();
		this.couId=couId;
		this.couName=couName;
		this.couAddress=couAddress;
		this.couTime=couTime;
		this.teacher=teacher;
	}

	public int getCouId() {
		return couId;
	}

	public void setCouId(int couId) {
		this.couId = couId;
	}

	public String getCouName() {
		return couName;
	}

	public void setCouName(String couName) {
		this.couName = couName;
	}

	public String getCouAddress() {
		return couAddress;
	}

	public void setCouAddress(String couAddress) {
		this.couAddress = couAddress;
	}

	public String getCouTime() {
		return couTime;
	}

	public void setCouTime(String couTime) {
		this.couTime = couTime;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	
	


	

}
