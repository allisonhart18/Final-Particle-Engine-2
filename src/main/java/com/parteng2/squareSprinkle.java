/*
 * Coder: Allison Hart
 * 9/23/2024
 * subclass contining all of square sprinkle info
 * 
 * 
 * 
 */






package com.parteng2;

import processing.core.PApplet;

class squareSprinkle extends Particle {

        squareSprinkle(PApplet main,float x, float y, float vx, float vy, float size, int color) {
            super(main, x, y, vx, vy, size, color);
        }
    
        

        @Override
        void display() {
            main.fill(color);
            main.noStroke();
            main.rect(x, y, size, size); // Square
            main.ellipse(x, y, size / 2, size / 2); // Top-left corner circle/ellipse
            main.ellipse(x + size, y, size / 2, size / 2); // Top-right corner circle/ellipse
            main.ellipse(x, y + size, size / 2, size / 2); // Bottom-left corner circle/ellipse
            main.ellipse(x + size, y + size, size / 2, size / 2);
        }
    
        @Override
        void mouseClicked() {
            // Change color on mouse click
            color = main.color( main.random(255), main.random(255), main.random(255));
        }
    
        @Override
        void keyPressed() {
            // Decrease speed on key press
            vx *= 0.8;
            vy *= 0.8;
        }
    }
    


