/**
 * Created by Кирилл on 07.08.2015.
 */
public class Capitalizator {
    public static void main(String[] args) {
        /*
        Написать программу, которая принимает строку и делает все слова заглавными:

        “ЭТО настояшая пРоверка Букв” => “Это Настоящая Проверка Букв”
         */

        String in = "ЭТО НастоЯЩая проверка бУкВ";
        String out = "";

        for (int i = 0; i < in.length(); i++) {
            char prev = i > 0 ? in.charAt(i - 1) : ' ';
            char current = in.charAt(i);
            if (prev == ' ') {
                out += (current + "").toUpperCase();
            } else {
                out += (current + "").toLowerCase();
            }
        }
        System.out.println(out);
    }
}
