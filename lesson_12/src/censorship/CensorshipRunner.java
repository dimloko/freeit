package censorship;

import java.io.IOException;

public class CensorshipRunner {
    public static void main(String[] args) throws IOException {
        Censor censor = new Censor();
        censor.exposeCensor("./src/censorship/blacklist.txt", "./src/censorship/inputText.txt");
        //Раскоментировать чтобы увидеть содержимое файлов
//        System.out.println(censor.getBlackList());
//        System.out.println(censor.getInputText());
    }
}
