package com.calculatorapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Get first number
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            // Get operator
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Get second number
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }

                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid operator!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}