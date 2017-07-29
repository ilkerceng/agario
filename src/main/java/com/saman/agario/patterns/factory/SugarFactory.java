package com.saman.agario.patterns.factory;

import java.awt.Color;

import com.saman.agario.entites.Food;
import com.saman.agario.entites.Sugar;
import com.saman.agario.patterns.strategies.StepStrategy;
import com.saman.agario.vector.Vector;

public class SugarFactory extends FoodAbstractFactory {
	int sideHalfLength;
	
	public SugarFactory(Color color, double mass, double speed, Vector direction, Vector location,
			StepStrategy stepStrategy, int sideHalfLength) {
		super(color, mass, speed, direction, location, stepStrategy);
		
		this.sideHalfLength = sideHalfLength;
	}

	public Food createFood() {
		return new Sugar(color, mass, speed, direction, location, stepStrategy, sideHalfLength);
	}

}
