package ex0;

import java.util.ArrayList;

/**
 * Created by Кирилл on 09.08.2015.
 */
public class Being {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Being pinguin = new Penguin();
        Bird pin = new Penguin();
        pin.fly();


    }
}
