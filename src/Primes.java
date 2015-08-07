import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Кирилл on 06.08.2015.
 */
public class Primes {
    public static void main(String[] args) {

        /*
         Перебираем все числа от 1 до N и пытаемся делить на уже найденные числа (их храним в ArrayList).
         Если ни на кого не делится, то значит простое и его можно добавить в массив.
         */

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

        int[] newArray = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(array));
    }
}
