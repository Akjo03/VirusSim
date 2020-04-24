package model;

import java.util.ArrayList;

import model.Persons.HealthyPerson;
import model.Persons.InfectedPerson;
import processing.core.*;

/**
 * Im Canvas befinden sich alle Personen und die Wand. Diese werden alle hier erstellt.
 * 
 * @author Lukas Freckmann
 * @author Yann Flückiger
 */

public class Canvas {
	PApplet pView;
	
	private ArrayList<Person> personen = new ArrayList<Person>();
	private static int width, height;
	private static int backgroundColor;
	//private Wand wand;
	
	public Canvas(PApplet pView, int width, int height) {
		this.pView = pView;
		Canvas.width = width;
		Canvas.height = height;
	}
	
	//Zeichnet das Spielfeld
	public void drawCanvas() {
		for (int personCount = 0; personCount < personen.size(); personCount++) {
			personen.get(personCount).drawPerson();
		}
	}
	
	//Erstellt alle Personen
	public void createPersons(int anzahlHealthy, int anzahlInfected) {
		for (int personCount = 0; personCount < anzahlHealthy; personCount++) {
			personen.add(new HealthyPerson(pView));
		}
		for (int personCount = 0; personCount < anzahlInfected; personCount++) {
			personen.add(new InfectedPerson(pView));
		}
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
