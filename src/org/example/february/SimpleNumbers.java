package org.example.february;

public class SimpleNumbers {
    public static void main(String[] args) {
        int start = 2;
        int end = 100;

        System.out.println("Simple numbers " + start + " to " + end + " including:");

        for (int i = start; i <= end; i++) {
            if (isSimple(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isSimple(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

