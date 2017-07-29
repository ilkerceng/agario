package com.saman.agario.screen;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.saman.agario.game.Environment;

public class MainFrame extends JFrame {
	public Display display;
	public Environment environment;
	private static final long serialVersionUID = 1L;

	public MainFrame(Environment environment) {
		this.environment = environment;
		this.setTitle(environment.gameName);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.display = new Display(environment);
		this.getContentPane().add(display);
		this.setSize(environment.windowWidth, environment.windowHeight);
	}

}
