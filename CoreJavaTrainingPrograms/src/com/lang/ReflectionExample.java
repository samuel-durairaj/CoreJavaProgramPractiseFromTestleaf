package com.lang;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	/*
	 * Reflection API is used to introspect an .class file (bytecode)
	 */

	public static void main(String[] args) throws Exception {
		Class cls =Class.forName("com.lang.Employee");
		System.out.println(cls.getName());
		
		Constructor cons[] = cls.getDeclaredConstructors();
		for(int i=0;i<cons.length;i++) {
			System.out.println(cons[i]);
		}
		System.out.println("***********************************");
		Field fields[] = cls.getDeclaredFields();
		for(int i=0;i<fields.length;i++) {
			System.out.println(fields[i]);
		}
		System.out.println("***********************************");
		Method meth[] = cls.getDeclaredMethods();
		for(int i=0;i<meth.length;i++) {
			System.out.println(meth[i]);
			if(meth[i].getName().equalsIgnoreCase("setName")) {
				//meth[i].setAccessible(true); // Private methods can also be accessed using reflections 
				meth[i].invoke(cls.newInstance(), "SamuelRaj");
				Annotation annos[] = meth[i].getAnnotations();
				for(int j=0;j<annos.length;j++) {
					if(annos[j] instanceof FWAnnotation)
					{
						FWAnnotation fwAnno = (FWAnnotation)annos[j];
						System.out.println(fwAnno.id());
						System.out.println(fwAnno.desc());
					}
				}
			}
		}
	}
}
