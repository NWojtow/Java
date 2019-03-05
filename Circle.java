package com.company;


import java.util.Scanner;


public class Circle extends Figure implements Print{

    private double radius;

    public Circle(){
        this.radius=0;
    }
    public Circle(double r){
        this.radius=r;
    }
    public boolean makeCircle(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input radius of circle");
        try{
            this.radius=scanner.nextDouble();
            if(radius<=0){
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e){
            System.out.println("You have passed wrong argument");
            return false;
        }
        return true;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void Print(){
        System.out.println("Radius "+radius);
        System.out.println("Area "+area());
        System.out.println("Perimeter "+perimeter());}

}





