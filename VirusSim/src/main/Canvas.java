package main;

import java.util.ArrayList;

import processing.core.*;

/**
 * Im Canvas befinden sich alle Personen und die Wand. Diese werden alle hier erstellt.
 * 
 * @author Lukas Freckmann
 * @author Yann Flückiger
 */

public class Canvas {
	PApplet pView;
	
	private ArrayList<Person> personen;
	private static int width, height;
	private static int backgroundColor;
	//private Wand wand;
	
	Canvas(PApplet pView, int width, int height) {
		this.pView = pView;
		Canvas.width = width;
		Canvas.height = height;
	}
	
	//Zeichnet das Spielfeld
	public void drawCanvas() {
		// TODO Zeichne Canvas
	}
	
	//Erstellt alle Personen
	public void createPersons(int anzahl) {
		//TODO Erstelle Personen
	}
	
	
	
	
	//GETTERS AND SETTERS

	/**
	 * @return the width
	 */
	public static int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public static void setWidth(int width) {
		Canvas.width = width;
	}

	/**
	 * @return the height
	 */
	public static int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public static void setHeight(int height) {
		Canvas.height = height;
	}

	/**
	 * @return the backgroundColor
	 */
	public static int getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @param backgroundColor the backgroundColor to set
	 */
	public static void setBackgroundColor(int backgroundColor) {
		Canvas.backgroundColor = backgroundColor;
	}

	/**
	 * @return the personen
	 */
	public ArrayList<Person> getPersonen() {
		return personen;
	}
}
