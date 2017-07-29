package com.saman.agario.entites;

import java.awt.Color;

import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public class Sugar extends Food {

	int sideHalftLength;

	public Sugar(Color color, double mass, double speed, Vector direction, Vector location, StepStrategy stepStrategy, int sideHalfLength) {
		super(color, mass, speed, direction, location, stepStrategy);
		this.sideHalftLength = sideHalfLength;
	}

}
