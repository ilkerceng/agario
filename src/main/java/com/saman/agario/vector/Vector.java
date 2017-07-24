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
	
}

public double distanceTo(Vector other){
	
	double distX = this.x - other.x;
	double distY = this.y - other.y;
	
	double distance = Math.sqrt(distX * distX + distY * distY);
	
	return distance;
}

}
