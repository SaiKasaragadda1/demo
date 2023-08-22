package com.model;

public class Student {
	private int id;
	private String name;
	private String course;
	private double fees;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Student(int id,String name,String course,Double fees) {
		super();
		this.id=id;
		this.name=name;
		this.course=course;
		this.fees=fees;
	}

}
