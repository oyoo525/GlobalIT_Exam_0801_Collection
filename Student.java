package com.javastudy.ch08.collection;

public class Student {

	private int stno;
	private String name;
	private int grade;
	private String gender;
	
	
	public int getStno() {
		return stno;
	}
	public void setStno(int stno) {
		this.stno = stno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public Student () {}

	public Student (int stno, String name, int grade, String gender) {
		this.stno = stno;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
	}
	
	@Override
    public String toString() {
        return name + "(" + stno + " - " + grade + "학년 " + gender + ")";
    }
	
	
}
