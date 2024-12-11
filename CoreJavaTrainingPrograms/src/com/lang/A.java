package com.lang;

//Static import
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;
//java.lang package is auto-imported
//Every class we write in Java is a sub-class of the package java.lang.Object, background in JVM  Ex: public class A extends Object
//Large number of package import will delay the compilation time

public class A {

	protected int count =10;
	
	public A() {
		BigInteger big = valueOf(10);
	}
}
