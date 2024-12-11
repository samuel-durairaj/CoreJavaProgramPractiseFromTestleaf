package com.lang;

//Cloneable is an empty interface which is used as marker interface

public class Employee implements Cloneable {
	int id;
	String name;
	A a;
	
	public Employee() {
		a = new A();
	}
	public Employee(int name) {
		a = new A();
	}
	public A getA() {
		return a;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@FWAnnotation(id=12, desc = "setNameDesc")
	public void setName(String name) {
		System.out.println("Set Name: "+name);
		this.name = name;
	}

	@Override
	public String toString() {
		return "id = "+id +" name= "+name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		Employee emp = (Employee)obj;
		if(emp.getId()==getId())
			return true;
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return id*20+10;
	}
	//Clone will create a new copy of the object, new memory allocation will be created in the heap memory
	public Employee clone() throws CloneNotSupportedException{
		return (Employee)super.clone();
	}
}
