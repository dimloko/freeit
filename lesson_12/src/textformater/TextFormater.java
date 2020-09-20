package textformater;

import java.util.StringTokenizer;

public abstract class TextFormater {
    static StringTokenizer tokenizer;

    static int numOfWords(String str) {
        int quantity = 0;
        tokenizer = new StringTokenizer(str, " ,:;");
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
            quantity++;
        }
        return quantity;
    }

    static boolean isHasPalindrome(String str) {
        tokenizer = new StringTokenizer(str, " ,.?!\"%^*");
        while (tokenizer.hasMoreTokens()) {
            if (isPalindrome(tokenizer.nextToken())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
