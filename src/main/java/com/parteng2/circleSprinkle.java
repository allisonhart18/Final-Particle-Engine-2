/*
 * Coder: Allison Hart
 * 9/23/2024
 * circle sprinkle class - holds sll info to create circle sprinkle
 * 
 */
package com.parteng2;

import processing.core.*;

public class circleSprinkle extends Particle {

    circleSprinkle(PApplet main, float x, float y, float vx, float vy, float size, int color) {
        super(main, x, y, vx, vy, size, color); //parameters
    }

    @Override // override is used in all subclasses to override a method from the super class
    void display() {
        main.fill(color); //start color
        main.ellipse(x, y, size, size); // Circle
    }

    @Override
    void mouseClicked() {
        vx *= -1; // Reverse direction on mouse click
        vy *= -1;
        color = main.color( main.random(255), main.random(255), main.random(255));
    }

    @Override
    void keyPressed() {
        size += 5; // Increase size on key press
    }
}



