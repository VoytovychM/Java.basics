package org.example.basics;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char z = scanner.next().charAt(0);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double result = calc(a,b, z);
        System.out.println(result);
    }
    public static double calc (double a, double b, char z){
        switch (z) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
            return Double.NaN;

        }
    };
}
