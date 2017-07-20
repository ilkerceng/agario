package com.saman.agario.patterns.strategies;

import com.saman.agario.entites.Entity;

public abstract class StepStrategy {
	public int numberOfTurns;

	public abstract void step(Entity entity, double deltaTime);

	public boolean isFinished() {
		return false;
	}

	public abstract String getName();

}
