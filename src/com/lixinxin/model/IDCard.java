package com.lixinxin.model;

import java.io.Serializable;

public class IDCard implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String cardName;
	private Student student;
	private Student student1;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Student getStudent1() {
		return student1;
	}

	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

//	@Override
//	public String toString() {
//		return "IDCard [id=" + id + ", cardName=" + cardName + ", student=" + student + "]";
//	}

	public IDCard() {
		super();
	}

}
