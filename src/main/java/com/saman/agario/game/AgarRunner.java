package com.saman.agario.game;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.saman.agario.screen.MainFrame;

public class AgarRunner {
	public JFrame frame;
	public Environment environment;
	private final String imagePath = "images/game-logos/Logo.bmp";
	private BufferedImage logo;

	public AgarRunner() {
		setLogo();
		Environment environment = new Environment(logo);
		this.frame = new MainFrame(environment);
	}

	public void setLogo() {
		try {
			URL imagePathAsUrl = ClassLoader.getSystemResource(imagePath);
			logo = ImageIO.read(new File(imagePathAsUrl.getPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public static void main(String[] args) {
		new AgarRunner();
	}

}
