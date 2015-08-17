package ex2Words;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Кирилл on 17.08.2015.
 */
public class SecondMain {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Java Programs\\Tasks\\src\\ex2Words\\text.txt"));
        StringBuilder sb = new StringBuilder();

        boolean isTrue = true;
        while (isTrue) {
            int i = fileReader.read();
            char c = (char) i;
            if (i == -1) {
                isTrue = false;
            }
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
            }


        System.out.println(sb+" ");

    }
}
