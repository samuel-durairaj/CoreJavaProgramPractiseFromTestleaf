package com.encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Encapsulation objRef = new Encapsulation("sam","durai",123,88);
		
	    System.out.println(objRef.getFirstName()+" "+objRef.getLastName()+" "+objRef.getId()+" "+objRef.getMarks());
	    objRef.setFirstName("enoch");
	    objRef.setLastName("thangaraj");
	    objRef.setId(1);
	    objRef.setMarks(100);
	    System.out.println(objRef.getFirstName()+" "+objRef.getLastName()+" "+objRef.getId()+" "+objRef.getMarks());
	}

}
