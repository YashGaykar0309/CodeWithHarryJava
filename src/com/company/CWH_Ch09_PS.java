package com.company;


class  Cylinder{

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

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


    public double surfaceArea(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
    public double volume(){
        return (Math.PI*radius*radius*height);
    }



}
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length =4;
        this.breadth =5;
    }

    public Rectangle(int length, int breadth) {
        this.length =length;
        this.breadth =breadth;
    }
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }


}
class Sphere{
    private int sradius;

    public int getSradius() {
        return sradius;
    }

    public void setSradius(int sradius) {
        this.sradius = sradius;
    }

    public double sVolume(){
        return ((4f/3f)*Math.PI*sradius*sradius*sradius);
    }
    public double sSurfaceArea(){
        return (4*Math.PI*sradius*sradius);
    }
}

public class CWH_Ch09_PS {
    public static void main(String[] args) {
        //problem 1
//        Cylinder mycylinder= new Cylinder();
//        mycylinder.setHeight(12);
//        System.out.println(        mycylinder.getHeight());
//        mycylinder.setRadius(9);
//        System.out.println(mycylinder.getRadius());

        //problem no 2
//        System.out.println("Surface area is "+mycylinder.surfaceArea());
//        System.out.println("Volume is "+mycylinder.volume());

        //problem no 3
//        Cylinder mycylinder= new Cylinder(9,12);
//        System.out.println(        mycylinder.getHeight());
//
//
//        System.out.println(mycylinder.getRadius());



//         problem no 4
        Rectangle r=new Rectangle(5,6);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());



//         problem no 5
        Sphere s=new Sphere();
        s.setSradius(5);
        System.out.println(s.sSurfaceArea());
        System.out.println(s.sVolume());







    }


}
