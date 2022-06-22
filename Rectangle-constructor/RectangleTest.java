package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle(10, 20,"Red");
		printRectangleAreaDetails(smallRectangle);

		System.out.println("-----------------------------");
		Rectangle bigRectangle = new Rectangle(30, 60,"Green");
		printRectangleAreaDetails(bigRectangle);

	}

 	private static void printRectangleAreaDetails(Rectangle rectangle) {
		System.out.println("Rectangle Height : " + rectangle.getHeight());
		System.out.println("Rectangle Width : " + rectangle.getWidth());
		System.out.println("Rectangle Color : " + rectangle.getColor());
		System.out.println("Area of rectangle is : " + rectangle.calculateArea());

	}

}
