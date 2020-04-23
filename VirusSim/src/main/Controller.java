package main;

import java.awt.Toolkit;

import processing.core.*;

public class Controller {
	PApplet pView;
	Controller(PApplet pView) {
		this.pView = pView;
	}
	
	Spielfeld spielfeld;
	
	public void setup() {
		pView.getSurface().setTitle("VirusSim v1");
		pView.getSurface().setSize(1920, 1080);
		pView.getSurface().setLocation((Toolkit.getDefaultToolkit().getScreenSize().width/2)-(pView.width/2), (Toolkit.getDefaultToolkit().getScreenSize().height/2)-(pView.height/2));
		pView.getSurface().setResizable(false);
		
		spielfeld = new Spielfeld(pView, 1, 1);
	}
	
	public void draw() {
		pView.smooth();
		pView.noStroke();
		pView.background(80);
		spielfeld.draw();
	}
}
