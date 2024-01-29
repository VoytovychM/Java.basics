package org.example.january;

import java.util.Scanner;

public class StringValueOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String result = getResult(x, y);
        System.out.println(result);

    }
    public static String getResult(int x, int y){
        if(x < 1 || x > 3 || y < 1 || y > 3){
            return "ERROR";
        }
        if(x == 2 || x == 3){
            return String.valueOf(x);
        } else {
            return String.valueOf(y);
        }
    }
}
