package org.example.january;


import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {
        int[] array = {5, 16, 54, 735, 32, 5};
        int[] array2 = {5, 16, -54, 735, -32};
        System.out.println("Max element: " + getMaxNumber(array));
        System.out.println("Max index: " + evenIndex(array));
        System.out.println("Sum of Even Positive Elements: " + calculateSumOfEvenPositiveElements(array2));
        System.out.println("Sum of Arithmetic Mean Number: " + calculateSumOfArithmeticMeanNumber(array));
        System.out.println("Arithmetic Mean Number of Array: " + Arrays.toString(FoundSumOfArithmeticMeanNumber(array)));
        System.out.println("Minimum elements of Array: " + Arrays.toString(find2MinNumbers(array)));
        System.out.println("Sum of Absolute Values: " + calculateSumOfAbsoluteValues(array2));
        System.out.println("Minimal element of Absolute Values: " + findMinElementOfAbsoluteValues(array2));


    }

    //В массиве найти максимальный элемент
    public static int getMaxNumber(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) maxElement = array[i];
        }
        return maxElement;
    }

    //  В массиве найти максимальный элемент с четным индексом
    public static int evenIndex(int[] array) {
        int maxIndex = array[0];
        for (int i = 2; i < array.length; i += 2) {
            if (array[i] > maxIndex) maxIndex = array[i];
        }
        return maxIndex;

    } // В массиве, содержащем положительные и отрицательные целые числа,

    // вычислить сумму четных положительных элементов
    private static int calculateSumOfEvenPositiveElements(int[] array2) {
        int sum = 0;
        for (int num : array2) {
            if (num > 0 && num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int calculateSumOfArithmeticMeanNumber(int[] array) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

    // Найти в массиве те элементы, значение которых
    // меньше среднего арифметического, взятого от всех элементов массива
    private static int[] FoundSumOfArithmeticMeanNumber(int[] array) {
        int aver = calculateSumOfArithmeticMeanNumber(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < aver) {
                count++;

            }
        }
        int[] result = new int[count];
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < aver) {
                result[count1] = array[i];
                count1++;
            }
        }
        return result;
    }

    // В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
    //между собой (оба являться минимальными), так и различаться
    private static int[] find2MinNumbers(int[] array) {
        int[] result = new int[2];
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        result[0] = min;
        min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (i != minIndex && array[i] < min) {
                min = array[i];
            }
        }
        result[1] = min;
        return result;
    }

    // Вычислить сумму модулей элементов массива (для вычисления модуля используйте Math.abs() )
    public static int calculateSumOfAbsoluteValues(int[] array) {
        int result = 0;
        for (int elem : array) {
            result = Math.abs(elem) + result;
        }
        return result;
    }
   // Найти номер минимального по модулю элемента массива
   public static int findMinElementOfAbsoluteValues(int[] array) {
       int min = array[0];
       int minIndex = 0;
       for (int i = 0; i < array.length; i++) {
           int currentElementOfArray = array[i];
           int absCurrentElementOfArray = Math.abs(currentElementOfArray);
        if (absCurrentElementOfArray < min) {
               min = Math.abs(currentElementOfArray);
               minIndex = i;
           }
       }
       return minIndex;
   }

}

