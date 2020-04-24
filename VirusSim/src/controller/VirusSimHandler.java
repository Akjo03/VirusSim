package controller;

import processing.core.*;

/**
 * Hauptprogramm... initialisiert Processing und gibt alles am Controller weiter.
 * 
 * @author Lukas Freckmann
 * @since 2020-04-24
 */

public class VirusSimHandler extends PApplet {
	public static void main(String args[]) {
		//Processing-Initialisierung
		String[] processingArgs = { "VirusSimHandler" };
		VirusSimHandler mySketch = new VirusSimHandler();
		PApplet.runSketch(processingArgs, mySketch);
	}
	
	Controller controller = new Controller(this); //Controller wird erstellt
	
	public void settings() {
		//Grösse des Fensters auf (0, 0). Controller wird das Fenster dann vergrössern.
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
