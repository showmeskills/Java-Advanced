package Demo05.Writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Demo03Writer {
    public static void main(String ...args) throws IOException {
        FileWriter fr = new FileWriter(
                new File(new File("").getAbsolutePath(),"src/d.txt")
                ,true
        );
        char[] newContent = {'E','v','x','z','y'};
        fr.write('\r');
        fr.write(newContent);//char[] 会自动转化为String 类型
        fr.write('\r');
        fr.write("程序员Terry");
        fr.write('\r');
        fr.write("程序员Terry",0,3);
        fr.close();
    }
}
