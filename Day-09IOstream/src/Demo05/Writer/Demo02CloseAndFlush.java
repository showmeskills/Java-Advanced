package Demo05.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02CloseAndFlush {
    public static void main(String ...args)throws Exception {
        FileWriter fw = new FileWriter(
                new File( new File("").getAbsoluteFile(),"src/d.txt")
        );
        fw.write(97);
        fw.write(98);
        fw.write(99);
        fw.write(100);
        fw.write(101);
        //使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
        fw.flush();
        //刷新之后可以继续使用 流
        fw.write(102);
        fw.write(103);
        fw.write(104);
        //释放资源(会先把内存缓冲区中的数据刷新到文件中)
        //close方法之后流已经关闭了,已经从内存中消失了,流就不能再使用了
        //在close之后再使用流的话会报错;
        fw.close();
        //fw.write(105) ==> 报错
    }
}
