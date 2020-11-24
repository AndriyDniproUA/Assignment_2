package com.savytskyy.assignment2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle userCircle;
        Scanner sc = new Scanner (System.in);

        System.out.println("Java elementary");
        System.out.println("started 18-11-2020\n");
        System.out.println("Assignment #2");
        System.out.println("Create 10 points and determine whether they are inside the circle");

        //ask user for 10 points *******************************************
        System.out.println("At this stage-1 please enter coordinates of 10 points\n");
        Point[] points = new Point[10];
        for (int i=0; i< points.length;i++) {
            System.out.println("Point "+(i+1)+":");
            System.out.print("X:");
            double x = sc.nextDouble();
            System.out.print("Y:");
            double y = sc.nextDouble();
            points [i] = new Point (x, y);
            System.out.println();
        }

        //testing the integrity of the points array
        /*for (int i=0;i<10;i++) {
            System.out.println(points[i].getX()+","+points[i].getY());

        }*/


        //ask the user for circle center and radius ***************************
        System.out.println("At this stage-2 please enter your circle center (X,Y) and radius:\n");
        {
            System.out.print("Circle center X:");
            double x = sc.nextDouble();
            System.out.print("Circle center Y:");
            double y = sc.nextDouble();
            System.out.print("Circle Radius R:");
            double r = sc.nextDouble();
            userCircle = new Circle(new Point(x,y), r);
        }

        //testing the integrity of userCircle object
        /*
        System.out.println(userCircle.getCenter().getX());
        System.out.println(userCircle.getCenter().getY());
        System.out.println(userCircle.getRadius());
        */

        // checking of the points location within the circle *********************

        System.out.println("\n\nAt this stage-3 we printout only the points that are located inside the specified circle\n");


        for (int i=0; i< points.length;i++) {
            if (userCircle.containsPoint(points[i])) {
                System.out.println("Point #"+(i+1)+": X="+points[i].getX()+","+"Y="+points[i].getY());
            }
        }
    }
}
