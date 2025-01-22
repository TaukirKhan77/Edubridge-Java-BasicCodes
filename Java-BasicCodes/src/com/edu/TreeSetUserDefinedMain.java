package com.edu;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class Employee2{
	private int eid;
	private String ename;
	private float esalary;
	
	public Employee2(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}


	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}


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
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}


class Employee2SortId implements Comparator<Employee2>{


	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		if(o1.getEid()<o2.getEid())
			return -1;
		else if(o1.getEid()>o2.getEid())
			return 1;
		else
			return 0;
	}
}
public class TreeSetUserDefinedMain {
	public static void main(String[] args) {
		Employee2SortId esort = new Employee2SortId();
		TreeSet<Employee2> temp = new TreeSet<Employee2>(esort);
		Employee2 e1= new Employee2(101,"Pramod",45632);
		Employee2 e2= new Employee2(100,"Kiran",55632);
		Employee2 e3= new Employee2(99,"Manoj",50632);
		Employee2 e4= new Employee2(80,"Sweta",655632);
		temp.add(e1);
		temp.add(e2);
		temp.add(e3);
		temp.add(e4);
		
		//System.out.println(temp);
		//use Iterator
		
		Iterator<Employee2> itemp = temp.iterator();
		System.out.println("EID\tEname\tEsalary");
		while(itemp.hasNext()) {
			Employee2 e = itemp.next();
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsalary());
		}


	}


}

