package Seminar002;

// import java.math.BigDecimal;
import java.util.Arrays;
// import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
/*        BigDecimal a = BigDecimal.valueOf(999999999);

        Scanner scanner = new Scanner(System.in);
        BigDecimal b = scanner.nextBigDecimal();

        System.out.println(b.multiply(a));*/

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(insertIntoArray(arr, 5, 1)));
        System.out.println(Arrays.toString(insertIntoArray(arr, 5)));
    }

    public static int[] insertIntoArray(int[] arr, int value, int index) {
        if(index < 0 || index > arr.length) {
            throw new IllegalArgumentException("РРЅРґРµРєСЃ РІС‹С€РµР» Р·Р° СЂР°РјРєРё РјР°СЃСЃРёРІР°");
        }
        int[] result = new int[arr.length + 1];

        System.arraycopy(arr, 0, result, 0, index);

        result[index] = value;

        System.arraycopy(arr, index, result, index + 1, arr.length - index);

        return result;
    }

    public static int[] insertIntoArray(int[] arr, int value) {
       return insertIntoArray(arr, value, arr.length);
    }

}

