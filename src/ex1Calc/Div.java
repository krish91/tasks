package ex1Calc;

import java.util.Stack;


/*
деление/division
 */
public class Div implements Cmd {

    @Override
    public void execute(String[] param, Stack<Double> stack) {
        stack.push(stack.pop()/stack.pop());
    }
}
