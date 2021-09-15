package Demo01.BufferedStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedWriter {
    public static void main(String ...args) throws IOException {
        show();
    }
    public static void show() throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/b.txt");
        FileWriter fw = new FileWriter(pathname);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i < 10; i++){
            bw.write("what the fuck python is the best of language");
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}
