package main;

import processing.core.*;

/**
 * Code für eine Person.
 * 
 * @author Yann Flückiger
 */

public class Person {
    PApplet pView;

    Person(PApplet pView) {
        this.pView = pView;
    }

    private PVector velocity;	//PVector kann 2 Werte in sich speichern
    private float dirX, dirY;	//Ist die Geschwindigkeit
    //private int color;			//Personenfarbe (Personenzustand)

    public void drawPerson() {
        velocity.add(new PVector(dirX, dirY));			//Fügt die Geschwindigkeit der Person hinzu
        pView.ellipse(velocity.x, velocity.y, 15, 15);	//Zeichnet den Kreis für die Person
    }
}