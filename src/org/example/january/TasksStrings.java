package org.example.january;

import java.util.Scanner;

public class TasksStrings {
    public static void main(String[] args) {
        String[] in = {"Nebuchadnezzar", "Artaxerxes", "Cyrus", "David", "Joseph"};
        findStringsWithShorterAverage(in);
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        identifyMonth(month);
    }
    // Ввести n строк с консоли. Вывести на консоль те строки,
    //длина которых меньше (больше) средней, а также длину.
    public static String[] findStringsWithShorterAverage (String[] strings){

        int totalOfElements = 0;
        for (int i = 0; i < strings.length; i++) {
            totalOfElements += strings[i].length();
        }

        double average = totalOfElements / strings.length;

        System.out.println("Average is " + average);
        for (int i = 0; i < strings.length; i++) {
            String currentStr = strings[i];
            if(currentStr.length() < average){
                System.out.println(currentStr);
                System.out.println(currentStr.length());
            }
        }

        return strings;
    }
    //Ввести число от 1 до 12. Вывести на консоль название месяца,
    // соответствующего данному числу. (Осуществить проверку корректности
    // ввода чисел).

    public static String[] identifyMonth (int month){
     String[] monthes = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String valueToPrint = monthes[month -1];
        System.out.println(valueToPrint);
        return monthes;

    }

}


