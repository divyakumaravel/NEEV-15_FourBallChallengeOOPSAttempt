package controller;

import implementation.DrawCircle;
import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static void main(String[] args) {
        PApplet.main("controller.TryProcessing",args);
    }

    DrawCircle drawCircle = new DrawCircle(800,500,30, this);

    @Override
    public void settings() {
        super.settings();
        size(drawCircle.getWidth(),drawCircle.getHeight());
    }

    public void draw(){
        drawCircle.draw();
    }


}
