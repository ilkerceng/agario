package com.saman.agario.patterns.factory;

import java.awt.Color;

import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public class OrganismFactory extends FoodAbstractFactory {
	double radius;

	public OrganismFactory(Color color, double mass, double speed, Vector direction, Vector location,
			StepStrategy stepStrategy, double radius) {
		super(color, mass, speed, direction, location, stepStrategy);
		this.radius = radius;
	}

	public Food createFood() {

		return new Organism(color, mass, speed, direction, location, stepStrategy, radius);
	}

}
