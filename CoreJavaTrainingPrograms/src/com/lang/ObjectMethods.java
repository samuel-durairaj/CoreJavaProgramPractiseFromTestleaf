package com.lang;

import java.io.IOException;

public class ObjectMethods {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		ObjectMethods met = new ObjectMethods();
		System.out.println(met);
		
		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setName("Sam");
		System.out.println(emp1);
	
		Employee emp2 = new Employee();
		emp2.setId(11);
		emp2.setName("Durairaj");
		System.out.println(emp2);
		
		System.out.println(emp1.equals(emp2));
		
		Employee emp3 = new Employee();
		emp3.setId(11);
		emp3.setName("Durai");
		System.out.println(emp2.equals(emp3));
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		//Clone - shallow copying
		//Deep copying -> serialization (java.io)
		try {
			Employee emp1Cloned = emp1.clone();
			System.out.println("Emp "+emp1.getA().hashCode());
			System.out.println("Cloned emp "+emp1Cloned.getA().hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.availableProcessors());
		try {
			Process process = runtime.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System class
		int one[] = {1,4,5,2,3};
		int two[] = new int[one.length];
		int three[] = one; // This is not array copy, rather, this copies the object reference
		for(int i=0;i<two.length;i++) {
			two[i]=one[i];
		}
		System.arraycopy(one, 0, two, 0, one.length);
		System.out.println(System.getProperties());
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}

}
