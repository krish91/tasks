package ex1Calc;

import java.util.Scanner;
import java.util.Stack;

/*
push 1
push 2
add
print
 */

public class Calc {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<Double>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            String[] word = line.split(" ");
            // добавить проверку, если пользователь вводит запятую, вместо точки и преобразовать эту запятую в точку
            // с помощью метода .replace(",", ".");
            if ("push".equals(word[0])) {
                stack.push(Double.parseDouble(word[1]));
            } else if (word[0].equals("print")) {
                System.out.println(stack);
            } else if (word[0].equals("add")) {
                double i = stack.pop() + stack.pop();
                stack.push(i);
            }
        }
    }

}
