package ex1Calc;
import java.util.Stack;

public class Push implements Cmd {

    @Override
    public void execute(String[] param, Stack<Double> stack) {
        double tempDouble = Double.parseDouble(param[1]);
        stack.push(tempDouble);
    }
}
