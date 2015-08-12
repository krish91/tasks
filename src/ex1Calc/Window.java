package ex1Calc;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Кирилл on 11.08.2015.
 */
public class Window extends JFrame {
    public Window() {
        setTitle("Calculator OOP");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("push");
        getContentPane().add(button, "South");

        setSize(300, 300);
        setVisible(true);
    }
}
