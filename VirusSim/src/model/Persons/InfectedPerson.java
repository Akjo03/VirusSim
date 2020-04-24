package model.Persons;

import model.Canvas;
import model.Person;

import processing.core.*;

/**
 * Gesunde Person wird als Person erstellt
 *
 * @author Yann Flückiger
 */

public class InfectedPerson extends Person {
	PApplet pView;
	public InfectedPerson(PApplet pView) {
		this.pView = pView;
		//Startposition zufällig auf Canvas
		this.setVelocity(new PVector(pView.random(20, Canvas.getWidth()-20), pView.random(20, Canvas.getHeight()-20)));
		//Zufällige Geschwindigkeit
		this.setDirX(pView.random(-2, 2));
		this.setDirY(pView.random(-2, 2));
		//Die Geschwindigkeit der Person darf nicht zwischen -1 und 1 liegen.
		if (this.getDirX() > -1 && this.getDirX() <= 0) {
			this.setDirX(-1);
		} else if (this.getDirX() > 0 && this.getDirX() <= 1) {
			this.setDirX(1);
		}
		if (this.getDirY() > -1 && this.getDirY() <= 0) {
			this.setDirY(-1);
		} else if (this.getDirY() > 0 && this.getDirY() <= 1) {
			this.setDirY(1);
		}
		//Farbe auf Rot
		this.setColor(this.pView.color(192, 32, 10));
	}
	
	@Override
	public void drawPerson() {
		pView.beginShape();
		pView.fill(this.getColor()); //Fülle Shape mit Farbe
		this.getVelocity().add(new PVector(this.getDirX(), this.getDirY())); //Neue Position berechnen
		//Person wird auf andere Seite teleportiert sobald aus dem Canvas
		if (this.getVelocity().x > Canvas.getWidth() - 5) {
			this.getVelocity().x = 5;
        } else if (this.getVelocity().x < 5) {
        	this.getVelocity().x = Canvas.getWidth()-5;
        } else if (this.getVelocity().y > Canvas.getHeight() - 5) {
        	this.getVelocity().y = 5;
        } else if (this.getVelocity().y < 5) {
        	this.getVelocity().y = Canvas.getHeight()-5;
        }
		pView.ellipse(this.getVelocity().x, this.getVelocity().y, 20, 20); //Neuer Kreis an neuer Position
		pView.endShape(); 
	}
}
