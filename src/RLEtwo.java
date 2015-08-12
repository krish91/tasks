
public class RLEtwo {
    public static void main(String[] args) {
        String line = "sssttttttopp hereeeee";
        StringBuffer newLine = new StringBuffer();

        for (int i = 0; i < line.length(); i++) {
            int letterCount = 1;

            while (i + 1 < line.length() && line.charAt(i) == line.charAt(i + 1)) {
                letterCount++;
                i++;
            }

            newLine.append(line.charAt(i));
            newLine.append(letterCount);
        }
        System.out.println(newLine);
        giveUsBackFirstLine(newLine);
    }

    static void giveUsBackFirstLine(StringBuffer newLine) {
        for (int i = 0; i < newLine.length() - 1; i++) {
            char tempChar = newLine.charAt(i + 1);
            int tempInt = Integer.parseInt(Character.toString(tempChar));
            while (tempInt > 0) {
                System.out.print(newLine.charAt(i));
                tempInt--;
            }
            i++;
        }
    }

}
