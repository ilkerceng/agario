package com.saman.agario.vector;

public class Vector {

	public double x;
	public double y;

	public Vector(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void normalize() {

		double length = Math.sqrt(this.x * this.x + this.y * this.y);
		this.x /= length;
		this.y /= length;

	}

	public double distanceTo(Vector other) {

		double distX = this.x - other.x;
		double distY = this.y - other.y;

		double distance = Math.sqrt(distX * distX + distY * distY);

		return distance;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	
}
