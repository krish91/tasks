package ex1Calc;

import java.util.Stack;

/**
 * Created by Кирилл on 11.08.2015.
 */
/*
сложение/addition
 */
public class Sub implements Cmd {
    @Override
    public void execute(String[] param, Stack<Double> stack) {
        stack.push(stack.pop() + stack.pop());
    }
}
