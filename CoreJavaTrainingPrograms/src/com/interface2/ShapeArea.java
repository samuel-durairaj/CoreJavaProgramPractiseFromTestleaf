package com.interface2;

import java.util.Scanner;

public class ShapeArea implements Area, Area_Curves{

	@Override
	public void Square() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the square: ");
		double s = scan.nextInt();
		double areaSquare = s*s;
		System.out.println("Area of the square: "+areaSquare);
	}
	@Override
	public void Circle() {
		System.out.println("Circle");
	}

	@Override
	public void Oval() {
		System.out.println("Oval");
	}
	@Override
	public void Rectangle() {
		System.out.println("Rectangle");
	}

	public static void main(String[] args) {
		ShapeArea geometry = new ShapeArea();
		geometry.Square();
	}

}
