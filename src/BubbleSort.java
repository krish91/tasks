import java.util.Arrays;

/**
 * Created by Кирилл on 06.08.2015.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] ourArray = {9, 7, 2, 0, 54, 24, 99, 10};

        for (int j = ourArray.length; j > 0; j--) {

            for (int i = 0; i < ourArray.length - 1; i++) {
                if (ourArray[i] > ourArray[i + 1]) {
                    int tmp = ourArray[i + 1];
                    ourArray[i + 1] = ourArray[i];
                    ourArray[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ourArray));
    }
}
