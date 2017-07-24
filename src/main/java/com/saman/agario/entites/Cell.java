package com.saman.agario.entites;

import java.awt.Color;

import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public abstract class Cell extends Entity{

	public Cell(Vector direction, Vector location, double speed, double mass, Color color, StepStrategy stepStrategy) {
		super(direction, location, speed, mass, color, stepStrategy);
	}

}
