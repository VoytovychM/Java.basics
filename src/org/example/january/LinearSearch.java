package org.example.january;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 6, 28, 12, 65, 53};
        System.out.println(linearSearch(array,28));

    }

    private static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] ==key){
                return i;
            }
        }
        return -1;
    }

}
