package com.edu;
import java.util.Iterator;
import java.util.LinkedList;
public class Employee1 {
private int eid;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public float getEsalary() {
	return esalary;
}
public void setEsalary(float esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee1 [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}
private String ename;
public Employee1(int eid, String ename, float esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
public Employee1() {
	super();
	// TODO Auto-generated constructor stub
}
private float esalary;
public static void main(String[] args) {
	LinkedList<Employee1> elist = new LinkedList<Employee1>();
	Employee1 e1 = new Employee1(1,"Dheeraj",19876);
	Employee1 e2 = new Employee1(2,"Khan",18876);
	Employee1 e3 = new Employee1(7,"Deepa",25876);
	Employee1 e4 = new Employee1(12,"Kiran",24876);
	Employee1 e5 = new Employee1(15,"Manoj",34876);

	elist.add(e1);
	elist.add(e2);
	elist.add(e3);
	elist.add(e4);
	elist.add(e5);

	System.out.println(elist);
// using itretors
	Iterator<Employee1> itobj = elist.iterator();

	System.out.println("eid\tename\tesalary");
	System.out.println("----------------------");
	while(itobj.hasNext()) {
	Employee1 s=itobj.next();
	//System.out.println(itobj.next());
	System.out.println(s.getEid()+"\t"+s.getEname()+"\t"+s.getEsalary());
	}


}

}
