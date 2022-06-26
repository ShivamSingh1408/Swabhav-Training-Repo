package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {

	public static void main(String[] args) {
		Circle smallCircle = new Circle(10, BorderType.SOLID, ColorType.GREEN);
		printAreaDetails(smallCircle);
		System.out.println("-----------------------------");
		Circle bigCircle = new Circle(-20, BorderType.DOTTED);
		printAreaDetails(bigCircle);
		System.out.println("-----------------------------");
		Circle testCircle = new Circle(500);
		printAreaDetails(testCircle);
	}

	private static void printAreaDetails(Circle circle) {
		System.out.println("Radius : " + circle.getRadius());
		System.out.println("Border : " + circle.getBorder());
		System.out.println("Color of circle is : " + circle.getColor());
		System.out.println("Area of circle = " + circle.calculateArea());

	}

}
