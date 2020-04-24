package model;

import model.Interfaces.PersonInterface;
import processing.core.PVector;

/**
 * Alle Variablen für eine Person (abstract class) mit GETTERS und SETTERS
 * @author Lukas Freckmann
 * @author Yann Flückiger
 */

public abstract class Person implements PersonInterface {
	private float dirX, dirY; 	//Geschwindigkeit
	private PVector velocity; 	//Position
	private int color;			//Farbe der Person
	
	
	//GETTERS AND SETTERS
	
	/**
	 * @return the dirX
	 */
	protected float getDirX() {
		return dirX;
	}
	/**
	 * @param dirX the dirX to set
	 */
	protected void setDirX(float dirX) {
		this.dirX = dirX;
	}
	/**
	 * @return the dirY
	 */
	protected float getDirY() {
		return dirY;
	}
	/**
	 * @param dirY the dirY to set
	 */
	protected void setDirY(float dirY) {
		this.dirY = dirY;
	}
	/**
	 * @return the velocity
	 */
	protected PVector getVelocity() {
		return velocity;
	}
	/**
	 * @param velocity the velocity to set
	 */
	protected void setVelocity(PVector velocity) {
		this.velocity = velocity;
	}
	/**
	 * @return the color
	 */
	protected int getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	protected void setColor(int color) {
		this.color = color;
	}
}
