package Demo05.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String ...args) throws IOException {
        FileWriter fw = new FileWriter(
                new File( new File("").getAbsoluteFile(),"src/d.txt")
        );
        fw.write(99);
        fw.close();
    }
}
