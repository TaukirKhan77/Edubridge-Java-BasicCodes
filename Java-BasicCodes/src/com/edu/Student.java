package com.edu;

public class Student {
	private int sid;
	private String sname;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	private float sfees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
