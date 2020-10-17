package textformater;

import java.io.*;

import java.util.StringTokenizer;

public class TextFormaterRunner extends TextFormater {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./src/textformater/input.txt"));
        String str = "";
        String tmp = reader.readLine();

        while (tmp != null) {
            str += tmp;
            tmp = reader.readLine();
        }

        System.out.println(str);
        reader.close();


        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/textformater/output.txt"));
        StringTokenizer st = new StringTokenizer(str, ".?!", true);
        while (st.hasMoreTokens()) {
            str = st.nextToken() + st.nextToken();
            if (isHasPalindrome(str)) {
                writer.write(str + "\n");
                continue;
            }
            if (3 <= numOfWords(str) && numOfWords(str) <= 5) {
                writer.write(str.trim() + "\n");
            }
        }
        writer.close();
    }
}
