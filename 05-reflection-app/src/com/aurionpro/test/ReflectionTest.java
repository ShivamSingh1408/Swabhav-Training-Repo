package com.aurionpro.test;

import com.aurionpro.model.*;

public class ReflectionTest {
	public static void main(String args[]) {
		try {
			Reflection obj = new Reflection();
			obj.getReflectionData(Class.forName(args[0]));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}