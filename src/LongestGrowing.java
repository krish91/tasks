/*
Напишите код, который ишет в массиве int arr[]={1,2,3,2,1,3,1,2,6,7,8,9,10,11,0,-1} самую длинную непрерывную возрастающую подпоследовательность: {1,2,6,7,8,9,10,11}.
 */

import java.util.ArrayList;

public class LongestGrowing {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1, 3, 1, 2, 6, 7, 8, 9, 10, 11, 0, -1};
        int seqStart = 0;
        ArrayList<Integer> index = new ArrayList<Integer>();

        // этим циклом мы вытаскиваем позицию из массива arr[], где начинается возрастающая последовательность и кладем ее в index
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                seqStart = i + 1;
                index.add(seqStart);
            }
        }

        // этот метод ищет разницу между соседними ячейками и сравнивает ее с предыдущей разностью
        // найдя самую большую разницу, мы кладем в StartPosition первую ячейку, а в EndPosition следующую ячейку
        int startPosition = 0;
        int endPosition = 0;
        for (int i = 0; i < index.size() - 1; i++) {
            if (index.get(i + 1) - index.get(i) > startPosition) {
                startPosition = index.get(i);
                endPosition = index.get(i + 1);
            }
        }

        // выполнять цикл пока позиции не сравняются
        int i = 0;
        while (arr[startPosition + i] != arr[endPosition]) {
            System.out.print(arr[startPosition + i] + " ");
            i++;
        }
    }
}
