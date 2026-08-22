package com.scjp.liskove;

public class Square implements Shape {
private int side;
	public Square(int side) {
		this.side=side;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the side
	 */
	public int getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(int side) {
		this.side = side;
	}



	@Override
	public int computeArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
}
