package palindrome;

import java.io.*;

public class PalindromeRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader fis = new BufferedReader(new FileReader("./src/palindrome/words.txt"));
        PalindromeFinder pf = new PalindromeFinder();
        while (pf.addWord(fis.readLine())) ;
        fis.close();
        pf.listWords();
        pf.writePalindromes();
    }
}
