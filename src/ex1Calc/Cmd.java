package ex1Calc;
import java.util.Stack;

public interface Cmd {
    void execute(String[] param, Stack<Double> stack);
}
