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

        ArrayList<Integer> primes = new ArrayList<Integer>();

        int N = 1000;
        boolean isTrue;

        for (int i = 2; i < N; i++) {
            isTrue = true;
            for (Integer prime : primes) {
                if (i % prime == 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                primes.add(i);
            }
        }

        System.out.println(primes);
    }
}
