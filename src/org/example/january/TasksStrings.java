package org.example.january;

public class TasksStrings {
    public static void main(String[] args) {
        String[] in = {"Nebuchadnezzar", "Artaxerxes", "Cyrus", "David", "Joseph"};
        findStringsWithShorterAverage( in);
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


}


