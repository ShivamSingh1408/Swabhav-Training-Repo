package com.aurionpro.model;

import java.lang.reflect.*;

public class Reflection {

	public static void getReflectionData(Class className) {
		System.out.print("\nName of the Class is : " + className.getName());

		Field fields[] = className.getDeclaredFields();
		System.out.println("\n\nFields of :*** " + className.getName() + " *** are :\n");
		for (Field f : fields) {
			System.out.println("Field Name: " + f.getName());
			System.out.println("Field Type: " + f.getType());
		}

		Method[] methods = className.getDeclaredMethods();
		System.out.println("\nMethods of :*** " + className.getName() + " *** are :\n");
		for (Method m : methods) {
			System.out.println("Method Name: " + m.getName());
		}
	}

}
