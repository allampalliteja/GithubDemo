package com.example;



import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");

        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");

        System.out.println("1. Addition");

        System.out.println("2. Subtraction");

        System.out.println("3. Multiplication");

        System.out.println("4. Division");

        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {

            case 1:

                result = add(num1, num2);

                break;

            case 2:

                result = sub(num1, num2);

                break;

            case 3:

                result = mul(num1, num2);

                break;

            case 4:

                result = div(num1, num2);

                break;

            default:

                System.out.println("Invalid operation");

                return;

        }

        System.out.println("Result: " + result);

    }

    public static double add(double n1, double n2) {

        return n1 + n2;

    }

    public static double sub(double n1, double n2) {

        return n1 - n2;

    }

    public static double mul(double n1, double n2) {

        return n1 * n2;

    }

    public static double div(double n1, double n2) {

        if (n2 == 0) {

            System.out.println("Error: Division by zero");

            return 0;

        }

        return n1 / n2;

    }
}
