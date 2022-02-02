package implementation;

import processing.core.PApplet;

public class Circle {

    private int ball1 = 0;
    private int ball2 = 0;
    private int ball3 = 0;
    private int ball4 = 0;

    private int width = 0;
    private int height = 0;
    private int diameter = 0;
    private  int stride = 0;


    PApplet myPApplet;
    public Circle(int width, int stride, int diameter, PApplet myPApplet){
        this.width = width;
        this.stride = stride;
        this.height = width*stride/5;
        this.diameter = diameter;
        this.myPApplet = myPApplet;
    }

    public void move() {
        ball(this.height*this.stride/5,this.ball1);
        this.ball1 = this.ball1+stride;
    }

    public void ball(int height, int speed){

        myPApplet.ellipse(speed,height,diameter,diameter);
    }


}
