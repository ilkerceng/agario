package com.saman.agario.entites;

import java.awt.Color;

import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public abstract class Entity {

	public Vector direction;
	public Vector location;
	public double speed;
	public double mass;
	public Color color;
	public StepStrategy stepStrategy;

	public Vector getDirection() {
		return direction;
	}

	public void setDirection(Vector direction) {
		this.direction = direction;
	}

	public Vector getLocation() {
		return location;
	}

	public void setLocation(Vector location) {
		this.location = location;
	}
	
	public void setXY(double x, double y){
		this.location.setX(x);
		this.location.setY(y);
	}

}
