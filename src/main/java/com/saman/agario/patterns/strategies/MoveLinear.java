package com.saman.agario.patterns.strategies;

import com.saman.agario.entites.Entity;

public class MoveLinear extends StepStrategy {

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
