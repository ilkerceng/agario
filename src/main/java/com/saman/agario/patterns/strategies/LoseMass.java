package com.saman.agario.patterns.strategies;

import com.saman.agario.entites.Entity;
import com.saman.agario.game.Environment;

public class LoseMass extends StepStrategy {

	public LoseMass(int numberOfTurns, Environment environment) {
		super(numberOfTurns, environment);
	}

	@Override
	public void step(Entity entity, double deltaTime) {

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
