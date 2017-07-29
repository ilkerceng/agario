package com.saman.agario.screen;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.saman.agario.game.Environment;

public class Display extends JPanel {
	public Environment environment;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Display(Environment environment) {
		this.environment = environment;
	}

	@Override
	public Dimension getPreferredSize() {
		return super.getPreferredSize();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

}
