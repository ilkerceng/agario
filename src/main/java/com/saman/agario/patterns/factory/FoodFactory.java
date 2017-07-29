package com.saman.agario.patterns.factory;

import com.saman.agario.entites.Food;

public class FoodFactory {
	public static Food createFood(FoodAbstractFactory foodAbstractFactory) {
		return foodAbstractFactory.createFood();
	}
}
