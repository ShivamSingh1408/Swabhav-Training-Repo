package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	private String color;

	public Rectangle(double height, double width, String color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double calculateArea() {
		double area = height * width;
		return area;

	}

}
