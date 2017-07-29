package com.saman.agario.patterns.strategies;

import com.saman.agario.entites.Entity;
import com.saman.agario.game.Environment;

public abstract class StepStrategy {
	protected int numberOfTurns;
	protected Environment environment;

	public StepStrategy(int numberOfTurns, Environment environment) {
		super();
		this.numberOfTurns = numberOfTurns;
		this.environment = environment;
	}

	public abstract void step(Entity entity, double deltaTime);

	public boolean isFinished() {
		return this.numberOfTurns <= 0;
	}

	public abstract String getName();

}
