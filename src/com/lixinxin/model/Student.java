package com.lixinxin.model;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private Integer sid;
	private String name;
	private Integer age;
	private Course course;
	private IDCard card;
	private IDCard card1;
	private Set<Teacher> teachers;
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public IDCard getCard() {
		return card;
	}

	public void setCard(IDCard card) {
		this.card = card;
	}
	
	public IDCard getCard1() {
		return card1;
	}

	public void setCard1(IDCard card1) {
		this.card1 = card1;
	}
	

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}

}
