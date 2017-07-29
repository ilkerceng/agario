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
	public final int windowWidth = EnvironmentConstants.windowWidth;
	public final int windowHeight = EnvironmentConstants.windowHeight;
	public final int leftPanelWidth = EnvironmentConstants.leftPanelWidth;
	public final BufferedImage logo;
	public final int numberOfSteps;
	public final String gameName = EnvironmentConstants.gameName;

	public List<Entity> entities;

	public Environment(BufferedImage logo) {
		super();
		this.logo = logo;
		this.numberOfSteps = 0; // it must be zero when environment is created
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

	private static class EnvironmentConstants {
		static final int windowHeight = 600;
		static final int windowWidth = 900;
		static final int leftPanelWidth = 600;
		static final String gameName = "Agar.IO Game";
	}

}
