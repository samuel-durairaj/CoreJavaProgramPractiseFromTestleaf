package com.lang;

public enum Planets {
	/* Enum is the best place to declare static and final constants
	 * best place to declare singleton object
	 * Singleton - design pattern, only one object of the singleton class is allowed
	 * Any related constants should be defined as Enums
	 * All enums are singleton
	 */
       MERCURY(10),
       VENUS(10),
       EARTH(10),
       MARS(10),
       JUPITER(10),
       SATURN(10),
       NEPTUNE(10);
       
       final int mass;
       
       //Enum can have only private constructors
       private Planets(int mass) {
    	   this.mass=mass;
       }
       
       public int getMass() {
    	   return mass;
       }
       public static void main(String[] args) {
		Planets planets[] =  Planets.values();
		for(int i=0;i<planets.length;i++)
		{
			System.out.println(planets[i].name()+" Ordinal "+planets[i].ordinal());
		}
	}
}
