/*
 * Coder: Allison Hart
 * 9/23/2024
 * 
 * Particle parent class that holds basic info for all subclasses
 * 
 * 
 */




package com.parteng2;

import processing.core.*;
/* abstract is used for subclasses to inherit anstract and concrete methods/functions
Requires that all classes either provide their own implementation (like display, ect) or to take on the functionality already written (like move)
*/

abstract class Particle { 
    // Particle Superclass

    float x, y;
    float vx, vy; // Velocity
    float size;
    int color;
    PApplet main;

    Particle(PApplet main, float x, float y, float vx, float vy, float size, int color) {
        this.main = main;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.size = size;
        this.color = color;
    }

    void move() {
        x += vx;
        y += vy;
        checkEdges();
    }

    void checkEdges() {
        if (x <= 0 || x >= main.width) vx *= -1; // Bounce horizontally
        if (y <= 0 || y >= main.height) vy *= -1; // Bounce vertically
    }

    abstract void display();

    abstract void mouseClicked();

    abstract void keyPressed();
}


