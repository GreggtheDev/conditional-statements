package org.example;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        if (num1 == num2) {
            System.out.println("Numbers are the same");
        } else if (num1 > num2) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}

