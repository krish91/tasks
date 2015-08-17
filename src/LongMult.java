/*
использовать то, что длинное число может быть представлено в виде: 123456789 = 789 + 1000*456 + 123*1000*1000
 */

public class LongMult {
    public static void main(String[] args) {
        int number = 123456789; // 123 456 789

        String tempString = number + "";
        String newString = "";
        String one = "1000*";

        for (int j = 3; j >0 ; j--) {
            for (int i = (j-1)*(tempString.length()/3); i < (tempString.length()/3)*j; i++) {
                newString += tempString.charAt(i);
            }

            switch (j) {
                case 3:
                    newString += "+" + one;
                    break;
                case 2:
                    newString += "+" + one + one;
                    break;
            }
        }

        System.out.println(newString);


    }
}
