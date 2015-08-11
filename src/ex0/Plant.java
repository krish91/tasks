package ex0;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
Этот класс читает файл
 */
public class Plant {
    public static void main(String[] args) throws IOException {
        InputStream test = new BufferedInputStream(new FileInputStream("C:\\музыка\\batir.mp3"));

        while (true) {
            int a = test.read();
            if (a == -1) break;
            char b = (char) a;
            System.out.print(b);
        }
    }
}
