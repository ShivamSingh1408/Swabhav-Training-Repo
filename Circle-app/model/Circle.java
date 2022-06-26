package com.aurionpro.model;

public class Circle {

	private double radius;
	private BorderType border;
	private ColorType color;

	public Circle(double radius, BorderType border, ColorType color) {
		this.radius = validateValues(radius);
		this.border = border;
		this.color = color;
	}

	public Circle(double radius, BorderType border) {
		this(radius, border, ColorType.RED);
	}

	public Circle(double radius) {
		this(radius, BorderType.DASH, ColorType.RED);
	}

	public double validateValues(double value) {
		if (value <= 0) {
			return 1;
		} else if (value > 50) {
			return 50;
		} else {
			return value;
		}
	}

	public double getRadius() {
		return radius;
	}

	public BorderType getBorder() {
		return border;
	}

	public ColorType getColor() {
		return color;
	}

	public double calculateArea() {
		return 3.142 * radius * radius;
	}

}
