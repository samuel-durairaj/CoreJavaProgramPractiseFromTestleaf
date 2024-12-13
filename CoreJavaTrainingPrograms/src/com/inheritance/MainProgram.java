package com.inheritance;

public class MainProgram {

	public static void main(String[] args) {
		Samsung sObj = new Samsung();
		Nokia nObj = new Nokia();
		Xiomi xObj = new Xiomi();
		
		//SAMSUNG Mobiles:
		System.out.println("Samsung Mobile Details");
		System.out.println("******************************");
		sObj.setAndroidVersion("Android Pie");
		System.out.println("Samsung Android Version:  "+sObj.getAndroidVersion());
		
		sObj.setCost(10000);
		System.out.println("Samsung Mobile Cost:  "+sObj.getCost());
		
		sObj.setColour("Black");
		System.out.println("Samsung Mobile Colour:  "+sObj.getColour());
		
		sObj.setRAM("12GB");
		System.out.println("Samsung Mobile RAM:  "+sObj.getRAM());
		System.out.println();
		
		//Nokia Mobiles:
				System.out.println("Nokia Mobile Details");
				System.out.println("******************************");
				nObj.setAndroidVersion("Marshmallow");
				System.out.println("Nokia Android Version:  "+nObj.getAndroidVersion());
				
				nObj.setCost(15000);
				System.out.println("Nokia Mobile Cost:  "+nObj.getCost());
				
				nObj.setColour("Blue");
				System.out.println("Nokia Mobile Colour:  "+nObj.getColour());
				
				nObj.setRAM("8GB");
				System.out.println("Nokia Mobile RAM:  "+nObj.getRAM());
				System.out.println();
				
				//Xiomi Mobiles:
				System.out.println("Xiomi Mobile Details");
				System.out.println("******************************");
				xObj.setAndroidVersion("Winstaar");
				System.out.println("Xiomi Android Version:  "+xObj.getAndroidVersion());
				
				xObj.setCost(12000);
				System.out.println("Xiomi Mobile Cost:  "+xObj.getCost());
				
				xObj.setColour("Silver");
				System.out.println("Xiomi Mobile Colour:  "+xObj.getColour());
				
				xObj.setRAM("10GB");
				System.out.println("Xiomi Mobile RAM:  "+xObj.getRAM());
		
		
	}

}
