package com.savytskyy.assignment2;

public class Circle {
    private Point center;
    private double radius;

    public Circle (Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    //getters

    public Point getCenter(){
        return this.center;
    }

    public double getRadius(){
        return this.radius;
    }

    //setters
    public void setCenter(Point center){
        this.center = center;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    boolean containsPoint(Point p) {
        return (this.center.distance(p)<=this.radius);
    }



























}
