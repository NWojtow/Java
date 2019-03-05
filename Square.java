package com.company;

import java.util.Scanner;

public class Square extends Figure implements Print {
    double side;

    public boolean makeSquare() {
        try {
            System.out.print("Input length of the side of Square: ");
            Scanner scanner = new Scanner(System.in);
            side = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("You passed illegal argument, try again.");
            return false;
        }
        return true;
    }


    @Override
    public double area() {


        return Math.pow(side,2);
    }

    @Override
    public double perimeter() {
        return side*4;
    }



    @Override
    public void Print() {

        System.out.println("Length of square side " + side);
        System.out.println("Area " + area());
        System.out.println("Perimeter " + perimeter());
    }
}