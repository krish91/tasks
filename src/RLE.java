/*
Написать архиватор, который сжимает текст с большим количеством повторений букв.
Например такой текст:
ТТТТТТТТУУУУУУУТТТТТТТ  ММММННННОООГГООО ПООООООВВВВВТТТТТОООРРООВВ
должен быть сжат вот так:
T8У7Т7 1М4Н4О3Г2О3 1П1О6В5Т5О3Р2О2В2
2. Написать программу, которая разархивирует строки, созданные в предыдущей программе

 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RLE {
    public static void main(String[] args) {
        String source = "h5e2r5e1 1i1s1 1t1o2 1m1u1c1h1 1r4e1p3e3a3t1s12";
        System.out.println(decode("1h2e3l5o2w4o2r4l1d"));
    }

        public static String decode(String source) {
            StringBuffer dest = new StringBuffer();

            Pattern pattern = Pattern.compile("[a-zA-Z]+|[0-9]");
            Matcher matcher = pattern.matcher(source);

            while (matcher.find()) {
                int number = Integer.parseInt(matcher.group());
                matcher.find();
                while (number-- != 0) {
                    dest.append(matcher.group());
                }
            }

            return dest.toString();
        }

}
