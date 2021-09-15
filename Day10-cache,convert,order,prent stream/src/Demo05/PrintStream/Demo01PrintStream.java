package Demo05.PrintStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main (String ...args) throws FileNotFoundException {
        printStream();
    }
    public static void printStream() throws FileNotFoundException {
        File path = new File(new File("").getAbsolutePath(),"src/f.txt");
        PrintStream ps = new PrintStream(path);
        //如果使用继承自父类的write方法写数据,那么查看数据的时候会查询编码表 97->a
        ps.write(97);
        //如果使用自己特有的方法print/println方法写数据,写的数据原样输出 97->97
        ps.println(97);
        ps.println(8.8);
        ps.println('a');
        ps.println("HelloWorld");
        ps.println(true);

        //释放资源
        ps.close();
    }
}
