package com.emmanuelscode;

/**
 * Composition class
 */
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton(); // we can define like this
        drawLogo(); // or we can define like this
        motherboard.loadProgram("Windows");
    }

    private void drawLogo(){
        // Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
