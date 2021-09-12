package Demo04.Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {
    public static void main(String ...args) throws IOException {
        FileReader fr = new FileReader(
                new File(new File("").getAbsolutePath(),
                        "src/c.txt")
        );
        char[] cs = new char[1024];//1024 或者 1024的倍数
        int len = 0;
        while((len = fr.read(cs))!= -1){
            System.out.println(new String(cs,0,len));
        }
        fr.close();
    }
}
