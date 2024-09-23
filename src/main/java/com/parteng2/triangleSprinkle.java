/*
 * Coder: Allison Hart
 * 9/23/2024
 * subclass contining all of triangle sprinkle info
 * 
 * 
 * 
 */

package com.parteng2;

import processing.core.PApplet;

class triangleSprinkle extends Particle {

    triangleSprinkle(PApplet main, float x, float y, float vx, float vy, float size, int color) {
        super(main, x, y, vx, vy, size, color); //parameters
    }

    @Override
    void display() {
        main.fill(color);
        main.triangle(x, y, x - size, y + size, x + size, y + size); // Triangle
    }

    @Override
    void mouseClicked() {
        vx = -vx; // Reverse horizontal direction on mouse click
    }

    @Override
    void keyPressed() {
        vy = -vy; // Reverse vertical direction on key press
    }

    boolean checkCollision(triangleSprinkle other) {
        // Basic bounding box collision detection
        return !(x + size < other.x || x - size > other.x + other.size ||
                 y + size < other.y || y - size > other.y + other.size);
    }
}
