package model;

/**
 * Einstellungen f�r die Simulation
 * @author Yann Fl�ckiger
 * @author Lukas Freckmann
 */

public class Settings {
	int windowWidth = 1920;
	int windowHeight = 1080;
	
	boolean isWand = false;
	int anzahlPersonen = 50;
	int anzahlInfizierte = 2;
	//Controller.canvas.wand.openingSpeed = 1;
	
	
	
	
	//GETTERS AND SETTERS
	
	public int getWindowWidth() {
		return windowWidth;
	}
	public int getWindowHeight() {
		return windowHeight;
	}
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}
	public int getAnzahlInfizierte() {
		return anzahlInfizierte;
	}
}
