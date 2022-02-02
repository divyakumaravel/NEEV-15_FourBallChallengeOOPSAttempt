package controller;

import implementation.Circle;
import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

public class TryProcessing extends PApplet{

    public static void main(String[] args) {

        PApplet.main("controller.TryProcessing",args);
    }


    private ArrayList<Circle> circleFactory(){
        ArrayList<Circle> circleArrayList = new ArrayList<>();
        circleArrayList.add(new Circle(800,1,30,this));
        circleArrayList.add(new Circle(800,2,30,this));
        circleArrayList.add(new Circle(800,3,30,this));
        circleArrayList.add(new Circle(800,4,30,this));
        return circleArrayList;
    }

    @Override
    public void settings() {
        super.settings();
        size(800, 600);
    }

    public void draw(){
        for (Circle circle:circleFactory()) {
            circle.move();
        }
    }


}
