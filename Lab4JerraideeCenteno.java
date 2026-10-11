/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4.jerraidee.centeno;

/**
 *
 * @author LENOVO LOQ
 */

import java.util.Scanner;

public class Lab4JerraideeCenteno {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== JAVA LOOPS LABORATORY ===");
            System.out.println("1. Multiplication Table Generator");
            System.out.println("2. Sum of Natural Numbers");
            System.out.println("3. Factorial Calculator");
            System.out.println("4. Even and Odd Numbers");
            System.out.println("5. Reverse Digits of a Number");
            System.out.println("0. Exit");
            System.out.print("Choose an activity: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    multiplicationTable();
                    break;
                case 2:
                    sumOfNaturalNumbers();
                    break;
                case 3:
                    factorialCalculator();
                    break;
                case 4:
                    evenAndOddNumbers();
                    break;
                case 5:
                    reverseDigits();
                    break;
                case 0:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        input.close();
    }

    // Activity 1: Multiplication Table using for loop
    static void multiplicationTable() {
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i
                    + " = " + (number * i));
        }
    }

    // Activity 2: Sum of Natural Numbers using while loop
    static void sumOfNaturalNumbers() {
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int i = 1;
        long sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }

    // Activity 3: Factorial using do-while loop
    static void factorialCalculator() {
        System.out.print("Enter a number (0 to 20): ");
        int n = input.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Please enter a number from 0 to 20.");
            return;
        }

        long factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= n);

        System.out.println("Factorial = " + factorial);
    }

    // Activity 4: Even and Odd Numbers using for loop
    static void evenAndOddNumbers() {
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Even numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    // Activity 5: Reverse Digits using while loop
    static void reverseDigits() {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        long reversed = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed: " + reversed);
    }
}
