package com.saman.agario.patterns.strategies;

import com.saman.agario.entites.Entity;
import com.saman.agario.game.Environment;

public class StandStill extends StepStrategy {

	public StandStill(int numberOfTurns, Environment environment) {
		super(numberOfTurns, environment);
	}

	@Override
	public void step(Entity entity, double deltaTime) {
		this.numberOfTurns--;
	}

	@Override
	public String getName() {
		return "Stand Still";
	}

}
