package task36;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListFolder {
    public static void main(String[] args) {

        File folder = new File("./src/task36/parentFolder");
        list(folder, 0);

    }

    static void list(File f, int level) {
        Pattern pat = Pattern.compile("\\\\[^\\\\]+$"); //регулярное выражение, чтобы оставлять только "хвост" пути
        Matcher mat;

        //Если переданный обект File - директория
        if(f.isDirectory()){
            printTab(level); //Печать отступов
            mat = pat.matcher(f.getPath());
            while (mat.find()) {
                System.out.println(mat.group()); //Печать хвоста пути
            }

            for(File file : Objects.requireNonNull(f.listFiles())) { //По списку в данной папке с рекурсивным вызовом мметода list
                list(new File(file.getPath()), level + 1);
            }
        }

        //Если переданный обект File - файл
        if(f.isFile()){
            printTab(level);
            mat = pat.matcher(f.getPath());
            while (mat.find()) {
                System.out.println(mat.group());
            }
        }
    }

    //Печать отступов в зависимости от уровня папки или файла
    static void printTab(int level){
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }
}





