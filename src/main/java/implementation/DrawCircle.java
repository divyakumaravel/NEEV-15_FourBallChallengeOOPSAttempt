package implementation;

import processing.core.PApplet;

public class DrawCircle  {

    private int ball1 = 0;
    private int ball2 = 0;
    private int ball3 = 0;
    private int ball4 = 0;

    private int width = 0;
    private int height = 0;
    private int diameter = 0;


    PApplet myPApplet;
    public DrawCircle(int width, int height, int diameter, PApplet myPApplet){
        this.width = width;
        this.height = height;
        this.diameter = diameter;
        this.myPApplet = myPApplet;
    }

    public void draw() {
        drawCircle(getHeight()/5,ball1);
        drawCircle(getHeight()*2/5,ball2);
        drawCircle(getHeight()*3/5,ball3);
        drawCircle(getHeight()*4/5,ball4);

        ball1++;
        ball2=ball2+2;
        ball3=ball3+3;
        ball4=ball4+4;

    }

    public void drawCircle(int height, int speed){
        myPApplet.ellipse(speed,height,diameter,diameter);
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
