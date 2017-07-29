package com.saman.agario.game;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.saman.agario.entites.Cell;
import com.saman.agario.entites.Entity;
import com.saman.agario.entites.Food;
import com.saman.agario.patterns.strategies.MoveRandom;
import com.saman.agario.patterns.strategies.StandStill;
import com.saman.agario.patterns.strategies.StepStrategy;

public class Environment {
	public final int windowWidth;
	public final int windowHeight;
	public final int leftPanelWidth;
	public final BufferedImage logo;
	public final int numberOfSteps;

	public List<Entity> entities;

	public Environment(int windowWidth, int windowHeight, int leftPanelWidth, BufferedImage logo, int numberOfSteps) {
		super();
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
		this.leftPanelWidth = leftPanelWidth;
		this.logo = logo;
		this.numberOfSteps = numberOfSteps;
		this.entities = new ArrayList<Entity>();
	}

	public String generateName() {

		return null;
	}

	public StepStrategy generateSugarStepStrategy() {
		int numberOfTurns = generateStepNumber();

		return new StandStill(numberOfTurns, this);
	}

	public StepStrategy generateOrganismStepStrategy() {
		int randNumber = new Random().nextInt(2);
		int numberOfTurns = generateStepNumber();

		if (randNumber == 0) {
			return new StandStill(numberOfTurns, this);
		} else {
			return new MoveRandom(numberOfTurns, this);
		}
	}

	public StepStrategy generateCellStepStrategy() {

		return null;
	}

	public int generateStepNumber() {
		return new Random().nextInt(90) + 10;
	}

	public Food createFood() {

		return null;
	}

	public Cell createCell() {

		return null;
	}

	public void stepAll(double deltaTime) {
		// call step methods of each entity
	}

}
