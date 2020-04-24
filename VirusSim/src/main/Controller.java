package main;

import java.awt.Toolkit;

import processing.core.*;

/**
 * Der Controller zeichnet das Spielfeld und steuert alles. Er initiiert am Anfang
 * auch den Fenstertitel, die Fenstergrösse usw. 
 * 
 * @author Lukas Freckmann
 * @author Yann Flückiger
 */

public class Controller {
	PApplet pView;
	
	Controller(PApplet pView) {
		this.pView = pView;
	}
	
	Canvas canvas;
	Settings settings;
	
	public void setup() {
		pView.getSurface().setTitle("VirusSim v1"); //Fenstertitel
		pView.getSurface().setSize(1920, 1080); 	//Fenstergrösse
		
		//Fensterposition in die Mitte des Bildschirms
		pView.getSurface().setLocation((Toolkit.getDefaultToolkit().getScreenSize().width/2)-(pView.width/2), (Toolkit.getDefaultToolkit().getScreenSize().height/2)-(pView.height/2)); 
		
		pView.getSurface().setResizable(false); //Fenster kann nicht vergrössert/verkleinert werden.
		
		canvas = new Canvas(pView, pView.width, pView.height); //Erstellt ein neuer Canvas in der Grösse des Fensters
		settings = new Settings();
		
		canvas.createPersons(settings.anzahlPersonen);
	}
	
	public void draw() {
		pView.smooth();
		pView.noStroke(); 				//Keine Ränder beim Zeichnen der Objekte
		pView.background(80); 			//Hintergrund auf Dunkelgrau
		canvas.drawCanvas(); 			//Zeichnet das Spielfeld
	}
}
