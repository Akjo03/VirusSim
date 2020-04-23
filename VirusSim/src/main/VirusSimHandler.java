package main;

import processing.core.*;

public class VirusSimHandler extends PApplet {
	public static void main(String args[]) {
		String[] processingArgs = { "VirusSimHandler" };
		VirusSimHandler mySketch = new VirusSimHandler();
		PApplet.runSketch(processingArgs, mySketch);
	}
	
	Controller controller = new Controller(this);
	
	public void settings() {
		size(0,0);
	}
	
	//Alles wird am Controller weitergegeben
	public void setup() {
		controller.setup();
	}
	
	public void draw() {
		controller.draw();
	}
}
