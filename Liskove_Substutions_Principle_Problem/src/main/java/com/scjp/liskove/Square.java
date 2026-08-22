package com.scjp.liskove;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		setWidth(width);
	}
	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		setHeight(height);
	}
	
	public void setSide(int side) {
		setWidth(side);
		setHeight(side);
	}
}
