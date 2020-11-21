package com.savytskyy.assignment2;

import java.lang.Math;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //getters
    public double getX (){
        return this.x;
    }

    public double getY (){
        return this.y;
    }
    //setters
    public void setX (double x){
        this.x = x;
    }

    public void setY (double y){
        this.y = y;
    }

    //distance method
    public double distance (Point point) {
        double x1 = this.x;
        double y1 = this.y;

        double x2 = point.getX();
        double y2 = point.getY();

        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        }




}
