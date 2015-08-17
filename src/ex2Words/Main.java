package ex2Words;
/*
Counting the number of words and symbols in file.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String addressOfFile = "C:\\Java Programs\\Tasks\\src\\ex2Words\\text.txt";
        BufferedReader fileReader = new BufferedReader(new FileReader(addressOfFile));
        ArrayList<Integer> list = new ArrayList<Integer>();

        start(fileReader, list, addressOfFile);
    }

    static void start(BufferedReader fileReader, ArrayList<Integer> list, String addressOfFile) throws IOException {
        fillTheListWithChars(list);
        boolean isTrue = true;
        int countingOfspaces = 0;
        int countOfWords = 0;
        int countingOfSymbols = 0;
        String address = giveBackNameOfFile(addressOfFile);
        String ourText = "";

        while (isTrue) {
            int temp = fileReader.read();
            if (isSpace(temp)) {
                countingOfspaces++;
            } else {
                if (howManySymbols(temp, list) > 0) {
                    countingOfSymbols++;
                }
            }
            if (temp == -1) isTrue = false;
            char chars = (char) temp;
            ourText += chars;
            System.out.print(chars);
        }

        countOfWords = howManyWords(ourText, list);
        System.out.println("\n\nIn file \"" + address + "\" we have: " + countingOfspaces + " spaces and " + countOfWords + " words." +
                "\n" + countingOfSymbols + " symbols...");
    }

    static void fillTheListWithChars(ArrayList<Integer> list) {
        for (int i = 33; i < 48; i++) {
            list.add(i);
        }
    }

    static boolean isSpace(int temp) {
        if (temp == 32) {
            return true;
        }
        return false;
    }

    static int howManyWords(String ourText, ArrayList<Integer> list) {
        String[] line = ourText.split(" ");
        int numberOfWords = 0;
        for (String s : line) {
            if (!s.equals("")) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

    static int howManySymbols(int temp, ArrayList<Integer> list) {
        int countOfSymbols = 0;
        for (Integer aList : list) {
            int tempList = aList;
            if (temp == tempList) {
                countOfSymbols++;
            }
        }
        return countOfSymbols;
    }

    static String giveBackNameOfFile(String addressOfFile) {
        char[] array = addressOfFile.toCharArray();
        String tempString = "";
        boolean isTrue = true;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == '\\') {
                for (int j = i + 1; j < array.length; j++) {
                    tempString += array[j];
                }
                break;
            }
        }
        return tempString;
    }
}
