package Seminar002;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        System.out.println((char)27 + "[32mИсходный массив: \n" + Arrays.toString(array)+ (char)27 + "[0m");
        System.out.println((char)27 + "[34mРезультат сортировки: \n" + Arrays.toString(sortCounting(array))+ (char)27 + "[0m");
    }
    public static int findMax (int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }
    public static int findMin (int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }    
    public static int[] sortCounting (int[] array) {
        int max = findMax(array);
        int min = findMin(array);
        int[] countArray = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min] += 1;
        }
        System.out.println(Arrays.toString(countArray));
        int count = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                array[count++] = i + min; 
            }
        }
        return array;
    }
}
