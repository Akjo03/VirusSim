package main;

import processing.core.*;

/**
 * Code für eine Person.
 * 
 * @author Yann Flückiger
 */

public class Person {
    PApplet pView;
    private PVector velocity; // PVector kann 2 Werte in sich speichern
    private float dirX, dirY; // Ist die Geschwindigkeit
    private int color; // Personenfarbe (Personenzustand)

    Person(PApplet pView, float newX, float newY) {
        this.pView = pView;
        velocity = new PVector(newX, newY);
    }

    public void drawPerson() {
        velocity.add(new PVector(dirX, dirY)); // Fügt die Geschwindigkeit der Person hinzu
        pView.fill(color);
        pView.ellipse(velocity.x, velocity.y, 20, 20); // Zeichnet den Kreis für die Person
    }
    
    
    
    
    
    
    

    // GETTERS AND SETTERS

    /**
     * @return the dirX
     */
    public float getDirX() {
        return dirX;
    }

    /**
     * @param dirX the dirX to set
     */
    public void setDirX(float dirX) {
        this.dirX = dirX;
    }

    /**
     * @return the dirY
     */
    public float getDirY() {
        return dirY;
    }

    /**
     * @param dirY the dirY to set
     */
    public void setDirY(float dirY) {
        this.dirY = dirY;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int color) {
        this.color = color;
    }
}