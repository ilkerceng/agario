package com.saman.agario.game;

import javax.swing.JFrame;

import com.saman.agario.screen.MainFrame;

public class AgarRunner {
	public JFrame frame;
	public Environment environment;

	public AgarRunner(Environment environment) {
		this.frame = new MainFrame();
		this.setEnvironment(environment);
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public static void main(String[] args) {

	}

}
