package com.saman.agario.patterns.strategies;

import com.saman.agario.entites.Entity;
import com.saman.agario.game.Environment;

public class MoveLinear extends StepStrategy {

	public MoveLinear(int numberOfTurns, Environment environment) {
		super(numberOfTurns, environment);
	}

	@Override
	public void step(Entity entity, double deltaTime) {

		double newX = entity.location.x + entity.direction.x;
		double newY = entity.location.y + entity.direction.y;
		
		entity.setXY(newX, newY);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
