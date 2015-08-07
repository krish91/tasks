import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by Кирилл on 06.08.2015.
 */
public class TreeMapSort {
    public static void main(String[] args) {
        /*
        Реализовать сортировку массива с помощью TreeMap<Integer,Integer>.
        В TreeMap будут лежать пары из двух интов -- ключа и значения.
        Ключ -- число, которое встретилось в массиве, а значение -- количество раз, которое оно встретилось.
        Сначала собираем статистику, а потом, с помощью цикла по TreeMap выводим числа нужное количество раз.
        После работы программы, в массиве должны быть отсортированные данные.
         */

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> newTreeMap = new TreeMap<Integer, Integer>();
        Random random = new Random();

//        создаем массив из рандомных чисел
        for (int i = 0; i < 10; i++) {
            treeMap.put(i, random.nextInt(10));
        }

//        выводим на печать наши значения
        for (Integer integer : treeMap.values()) {
            System.out.print(integer + " ");
        }
        System.out.println();

//        в новый массив в качестве ключа вставляем значение из старого массива, а в качестве значения вставляем
//        количество раз, сколько это число встречалось в старом массиве
        for (int i = 0; i < treeMap.size(); i++) {
            int key = treeMap.get(i);
            int value = 0;

            for (int j = 0; j < treeMap.size(); j++) {
                if (treeMap.get(i) == treeMap.get(j)) {
                    value += 1;
                }
                newTreeMap.put(key, value);
            }
        }
        System.out.println(newTreeMap);
    }
}
