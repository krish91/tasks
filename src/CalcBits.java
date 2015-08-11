/**
 * Created by Кирилл on 08.08.2015.
 */
public class CalcBits {
    public static void main(String[] args) {
        /*
        Написать функцию static int numOnes(int x){...}, которая вычисляет количество единиц в бинарном представлении числа x.
         */
        int x = 34; // 00001001
        System.out.println(x + " в бинарном виде: " + Integer.toBinaryString(x));

        System.out.print("Количество едениц в числе X: ");
//        с помощью метода .replace("x", "y"); мы заменяем элемент x на элемент y
        System.out.println(Integer.toBinaryString(x).replace("0","").length());
    }

}
