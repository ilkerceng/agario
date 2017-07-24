package com.saman.agario.patterns.factory;

import java.awt.Color;

import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public class Organism extends Food {

	double radius;

	public Organism(Color color, double mass, double speed, Vector direction, Vector location,
			StepStrategy stepStrategy, double radius) {
		super(color, mass, speed, direction, location, stepStrategy);
		this.radius = radius;
	}

}
