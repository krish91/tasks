import java.util.Arrays;

/**
 * Created by Кирилл on 09.08.2015.
 */
public class LongAdd {
    public static void main(String[] args) {
        /*
        Есть две строки a = “1231231231231423” и b = “8888888880000059556665455”.
        Реализовать алгоритм, который будет складывать соответствующие числа.
        Результат также должен быть представлен в виде строки.
        Подсказка: посмотрите как вы делаете такое сложение на бумажке и заставьте компьютер делать то же самое.
        Алгоритм должен работать для чисел, которые не водят в Double и Long и не использовать BigDecimal.
         */

        String a = "789";
        String b = "9999";
        String c = "";
//                    18
//                   198
//                 и т.д.
        int l = Math.max(a.length(), b.length()); // получаем максимум из двух длин
        int[] resDigits = new int[l + 1];

        for (int i = 0; i < l; i++) {
            int d0 = getNum(a, i);
            int d1 = getNum(b, i);

            resDigits[i] = resDigits[i] + d0 + d1;
            resDigits[i + 1] = resDigits[i] / 10;
            resDigits[i] = resDigits[i] % 10;
        }

        for (int i = l; i >= 0; i--) {
            c = c + resDigits[i];
        }

        System.out.println(Arrays.toString(resDigits));
        System.out.println(c);
    }

    static int getNum(String str, int position) {
        if (position >= str.length()) return 0;
        //мы вычитаем '0', чтобы получить int (можно посмотреть зависимость по таблице ASCII)
        return str.charAt(str.length() - 1 - position) - '0';
    }
}

