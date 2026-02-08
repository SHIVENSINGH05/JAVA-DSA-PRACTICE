package Inheritance;

public class Box {
    private double l;// it can use in this file because its private
    double h;
    double w;
//    double weight;

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public double getL() {
        return l;
    }

    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box (double side) {
        // super(); Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {// Pass 3 arguments
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}