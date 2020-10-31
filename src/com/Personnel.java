package com;

public class Personnel {
	int id,age;
	String name,sex;
	
	//添加构造方法
	Personnel() {
		
	}
	
	Personnel(int id,int age,String name,String sex){
		this.id=id;
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	

	//添加get/set方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	
	

}
