package com.saman.agario.entites;

import java.awt.Color;
import java.util.List;
import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public abstract class Entity {

	public Vector direction;
	public Vector location;
	public double speed;
	public double mass;
	public Color color;
	public StepStrategy stepStrategy;
	List<Entity> entities;

	public Entity(Vector direction, Vector location, double speed, double mass, Color color, StepStrategy stepStrategy) {
		super();
		this.direction = direction;
		this.location = location;
		this.speed = speed;
		this.mass = mass;
		this.color = color;
		this.stepStrategy = stepStrategy;
	}

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

	public void setXY(double x, double y) {
		this.location.setX(x);
		this.location.setY(y);
	}

}
