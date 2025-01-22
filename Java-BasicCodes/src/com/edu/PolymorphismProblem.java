package com.edu;
class Shape{
	public void draw() {
		System.out.println("Drawing a Shape");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Draw a Circle");
	}
	
}
class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Draw a Rectangle");
	}
}
class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Draw a Triangle");
	}
}
public class PolymorphismProblem {
public static void main(String[] args) {
	Shape myCircle= new Circle();
	Shape myRectangle= new Rectangle();
	Shape myTriangle= new Triangle();
	
	myCircle.draw();
	myRectangle.draw();
	myTriangle.draw();
	
}
}
