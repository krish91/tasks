package ex1Calc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


public class Calculator {
    public static void main(String[] args) {
        Map<String, Cmd> cmds = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Stack<Double> stack = new Stack<Double>();
        Window window = new Window();

        cycle(sc, init(cmds), stack);


    }

    static Map<String, Cmd> init(Map<String, Cmd> cmds) {
        cmds.put("push", new Push());
        cmds.put("print", new Print());
        cmds.put("div", new Div());
        cmds.put("pop", new Pop());
        cmds.put("mul", new Mul());
        cmds.put("sub", new Sub());
        return cmds;
    }

    static void cycle(Scanner sc, Map<String, Cmd> cmds, Stack<Double> stack) {
    //             we get String from our user and split it with .split(" ");
//             take first word (it shoud be push/pop/sub etc), compare it with KEYS from Map<String, Cmd> cmds = new HashMap<>();,
//             by this KEY we send params to execute method (param, stack)
        boolean isTrue = true;
        while (isTrue) {
            String line = sc.nextLine();
            String[] param = line.split(" ");

            if (param[0] != null) {
                Cmd c = cmds.get(param[0]);

                switch (param[0]) {
                    case "push":
                        c.execute(param, stack);
                        break;

                    case "print":
                        c.execute(param, stack);
                        break;

                    case "div":
                        c.execute(param, stack);
                        break;

                    case "pop":
                        c.execute(param, stack);
                        break;

                    case "mul":
                        c.execute(param, stack);
                        break;

                    case "sub":
                        c.execute(param, stack);
                        break;

                    case "exit":
                        isTrue = false;
                        break;

                    default:
                        System.out.println("null :(");
                }
            }
        }

    }
}
