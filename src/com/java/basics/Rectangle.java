package com.java.basics;

public class Rectangle {

	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void calculatePerimeter(){
		System.out.println("Perimeter : "+2*(length+breadth));
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setBreadth(10);
		rectangle.setLength(10);
		rectangle.calculatePerimeter();

	}
	
	

}
