package HomeWork002;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println((char)27 + "[32mИсходный массив: \n" + Arrays.toString(arr) + (char)27 + "[0m");
            System.out.println("На сколько сдвигаем: ");
            int n = Integer.parseInt(in.nextLine());
            System.out.println((char)27 + "[34mРезультат: \n" + Arrays.toString(reverse(arr,n)) + (char)27 + "[0m");      
        } catch (Exception e) {
            System.out.println((char)27 + "[31mНепредвиденная ошибка, введено не целое положительное число!" + (char)27 + "[0m");
        }
    }

    public static int[] reverse(int[] arr, int n) {
        int[] result = new int[arr.length];
        if (n > arr.length) n = n%arr.length;
        for (int i = 0; i < result.length; i++) {
            if(i + n < arr.length) {
                result[i+n] = arr[i];
            } else {
                result[i%n] = arr[i];
            }
        }

        return result;
    }
}
