package chapter8Exercises;

import static java.lang.Math.PI;

public class CylinderClass {
    private int radius = 1;
    private int height = 1;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public CylinderClass(int radius, int height){
        this.radius = radius;
        this.height = height;

    }
    public void volume(){
        double vol = PI * radius * radius * height;
    }
}
