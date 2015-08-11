package ex1Calc;
import java.util.Stack;

public class Push implements Cmd {

    @Override
    public void execute(String[] param, Stack<Double> stack) {
        String tempString = param[1].replace(',', '.');
        double tempDouble = Double.parseDouble(tempString);
        stack.push(tempDouble);
    }
}
