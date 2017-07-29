package com.saman.agario.patterns.strategies;

import java.util.Random;

import com.saman.agario.entites.Entity;
import com.saman.agario.game.Environment;

public class MoveRandom extends StepStrategy {

	public MoveRandom(int numberOfTurns, Environment environment) {
		super(numberOfTurns, environment);
	}

	@Override
	public void step(Entity entity, double deltaTime) {
		int x = new Random().nextInt(5);
		int y = new Random().nextInt(5);
		
		this.numberOfTurns--;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
