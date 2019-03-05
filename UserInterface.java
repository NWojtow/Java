package com.company;

import java.util.Scanner;

public class UserInterface {
    boolean again;
    boolean wrongNumber;
    int choice;
    boolean wrongLine;
    char input;
    Scanner scanner = new Scanner(System.in);

    UserInterface() {
        this.again = true;
        this.wrongNumber = false;
        this.wrongLine = false;
    }

    public void Interface() {
        System.out.println("Hello to my calculator ");
        while (again) {
            do {

                System.out.println("Which figure do you want to calculate?");
                System.out.println("1. Circle");
                System.out.println("2. Square");
                System.out.println("3. Triangle");
                try {
                    choice = scanner.nextInt();
                    if (choice != 1 && choice != 2 && choice != 3) {
                        throw new IllegalArgumentException();
                    }

                } catch (Exception e) {
                    System.out.println("You have passed wrong argument");
                    wrongNumber = true;
                }
            } while (wrongNumber);
            switch (choice) {
                case 1:
                    Circle circleToCalculate = new Circle();
                    circleToCalculate.makeCircle();
                    circleToCalculate.Print();
                    break;
                case 2:
                    Square squareToCalculate = new Square();
                    squareToCalculate.makeSquare();
                    squareToCalculate.Print();
                    break;
                case 3:
                    Triangle triangleToCalculate = new Triangle();
                    triangleToCalculate.makeTriangle();
                    triangleToCalculate.Print();
                    break;
            }

            do {
                System.out.println('\n' + "Do you want to calculeta something else? T/N");
                try {
                    input = scanner.next().charAt(0);
                    if (input != 'T' && input != 't' && input != 'N' && input != 'n') {
                        throw new IllegalArgumentException();
                    }
                } catch (Exception e) {
                    System.out.println("You have passed wrong argument");
                    wrongLine = true;
                }
            } while (wrongLine);
            if (input == 'N' || input == 'n') {
                again = false;
            }
        }
    }
}