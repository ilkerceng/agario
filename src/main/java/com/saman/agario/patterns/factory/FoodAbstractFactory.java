package com.saman.agario.patterns.factory;

import java.awt.Color;

import com.saman.agario.entites.Food;
import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public abstract class FoodAbstractFactory {
	Color color;
	double mass;
	double speed;
	Vector direction;
	Vector location;
	StepStrategy stepStrategy;
	
	 	
	public FoodAbstractFactory(Color color, double mass, double speed, Vector direction, Vector location,
			StepStrategy stepStrategy) {
		super();
		this.color = color;
		this.mass = mass;
		this.speed = speed;
		this.direction = direction;
		this.location = location;
		this.stepStrategy = stepStrategy;
	}


	public abstract Food createFood();
}
