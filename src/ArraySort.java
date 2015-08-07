import java.util.Arrays;
import java.util.Random;

/**
 * Created by Кирилл on 06.08.2015.
 */
public class ArraySort {
    public static void main(String[] args) {

        int[] array = new int[500000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);
        }
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }

    /*
    [x]         0
    [xx]        1
    [xxxx]      2
    [xxxxxxxx]  3

    [...N...]   k

    k = 2^N;
    k1 = 2^0 = 1;
    k2 = 2^1 = 2;
    k3 = 2^2 = 4;
    k4 = 2^3 = 8;
    ...

    Количество операций: N*logN;
     */
}
