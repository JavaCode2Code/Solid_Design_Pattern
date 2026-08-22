package com.scjp.liskove;

public class Main {
public static void main(String[] args) {
	Rectangle rectangle=new Rectangle(10, 20);
	System.out.println(rectangle.computeArea());
	
	Square square=new Square(10);
	System.out.println(square.computeArea());
	
	useRectangle(rectangle);
	
	
}

private static void useRectangle(Rectangle rectangle) {
	rectangle.setWidth(20);
	rectangle.setHeight(30);
	assert rectangle.getWidth()==20: "width is not equal to 20";
	assert rectangle.getHeight()==30:"Height is not equal to 30";
}
}
