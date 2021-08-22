package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first double: ");
        Double double1 = scanner.nextDouble();
        System.out.print("Enter the second double: ");
        Double double2 = scanner.nextDouble();
        Calculator adder = Double::sum;
        Calculator subtractor = (a, b) -> a - b;
        Calculator multiplier = (a, b) -> a * b;
        Calculator divider = (a, b) -> a / b;
        System.out.println("Sum is " + adder.calculate(double1, double2));
        System.out.println("Subtracted is " + subtractor.calculate(double1, double2));
        System.out.println("Multiplied is " + multiplier.calculate(double1, double2));
        System.out.println("Divided is " + divider.calculate(double1, double2));

    }

    @FunctionalInterface
    interface Calculator {
        Double calculate(Double double1, Double double2);
    }
}
