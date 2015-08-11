package ex1Calc;
import java.util.Stack;


public class Print implements Cmd {

    @Override
    public void execute(String[] param, Stack<Double> stack) {
        System.out.println(stack);
    }
}
