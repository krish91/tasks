package ex1Calc;
import java.util.Stack;


/*
get last element from out STACK
 */
public class Pop implements Cmd {

    @Override
    public void execute(String[] param, Stack<Double> stack) {
        System.out.println(stack.get(stack.size() - 1));
    }
}
