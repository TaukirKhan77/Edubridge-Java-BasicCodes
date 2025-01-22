package com.edu;
class Employee{
	int eid;
	public Employee(int eid) {
		System.out.println("Employee Class Constructor");
		this.eid=eid;
	}
	void upCast() {
		System.out.println("From Employee Class EID:"+eid);
	}
}
class Manager extends Employee2{
	int mid;
	public Manager(int eid,int mid) {
		super(eid);
		this.mid=mid;
		System.out.println("Manager class constructor");
	}
	void downCast() {
		System.out.println("From manager class MID"+mid);
	}
}
public class UpcastindandDowncasting {
public static void main(String[] args) {
	Employee2 empObj=new Manager(11,22);
	empObj.upCast();
	Manager mngObj=(Manager)empObj;
	mngObj.downCast();
}
}
