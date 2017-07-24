package com.saman.agario.patterns.factory;

public class FoodFactory {
	public static Food createFood(FoodAbstractFactory foodAbstractFactory){
		return foodAbstractFactory.createFood();
	}
}
