package org.example.january;

import java.util.Scanner;

public class CalculationReminder {
    public static void main(String[] args) {
        getNumbers();
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        calcResult(a, b, c);
    }

    public static void getNumbers() {
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
                counter++;
            }
            if (counter == 25) {
                break;
            }
        }


    }

    public static void calcResult(double a, double b, double c) {
        double reminder1 = a % 1.5;
        double reminder2 = b % 1.5;
        double reminder3 = c % 1.5;
        if (reminder1 < reminder2 && reminder1 < reminder3) {
            System.out.println(" Number " + a + ", Reminder" + reminder1);
        } else if (reminder2 < reminder1 && reminder2 < reminder3) {
            System.out.println(" Number " + b + ", Reminder" + reminder2);
        } else {
            System.out.println(" Number " + c + ", Reminder" + reminder3);

        }
    }


}

