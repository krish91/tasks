import java.util.Arrays;

/**
 * Created by Кирилл on 07.08.2015.
 */
public class MergeSort {
    public static void main(String[] args) {
        /*
        Самостоятельно реализовать сортировку слиянием: входной массив делится на две половины.
        Каждая сортируется с помощью слияния.
        Далее две половины сливаются в одну с помощью двух индексов.
         */

        int[] myArray = {5, 7, 3, 8, 9, 2, 1, 0, 5, 11, 15, 12, 4, 20};
        int[] tempArray = new int[myArray.length / 2];
        int count = 0;

        for (int i = myArray.length; i < myArray.length / 2; i--) {
            tempArray[count] = myArray[i];
            count++;
        }

        System.out.println(Arrays.toString(tempArray));
    }
}
