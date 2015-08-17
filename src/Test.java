import java.util.Arrays;
import java.util.List;

/**
 * Created by Кирилл on 14.08.2015.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 0};
        List<Integer> list = Arrays.asList(arr);
        int seqStart = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i + 1] < arr[i]) {
                if (i + 1 - maxLength > maxLength) {
                    maxLength = i + 1 - seqStart;
                }
                seqStart = i + 1;
            }
        }

        System.out.println(seqStart);
        System.out.println(maxLength);

    }
}
