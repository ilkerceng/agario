package com.saman.agario.entites;

import java.awt.Color;

import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public abstract class Food extends Entity {

	public Food(Color color, double mass, double speed, Vector direction, Vector location, StepStrategy stepStrategy) {
		super(direction, location, speed, mass, color, stepStrategy);
	}

}
