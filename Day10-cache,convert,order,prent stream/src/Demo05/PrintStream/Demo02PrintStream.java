package Demo05.PrintStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String ...args) throws FileNotFoundException {
        demo();
    }
    public static void demo() throws FileNotFoundException {
        System.out.println("我是在控制台输出");
        File path = new File(new File("").getAbsolutePath(),"src/f.txt");
        PrintStream ps = new PrintStream(path);
        System.setOut(ps);
        System.out.println("我在f.txt中输出");//这句话会打印在文件中
        ps.close();
    }
}
