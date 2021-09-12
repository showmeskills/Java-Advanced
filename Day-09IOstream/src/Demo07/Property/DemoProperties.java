package Demo07.Property;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
    public static void main (String ...args) throws IOException {
        //show();
        //show01();
        show02();
    }
    public static void show02() throws IOException {
        Properties props = new Properties();
        File pathname = new File(new File("").getAbsolutePath(),"src/e.txt");
        FileReader fr = new FileReader(pathname);
        //FileInputStream fis = new FileInputStream(pathname);
        props.load(fr);
        Set<String> set = props.stringPropertyNames();
        for(String key :set){
            String value = props.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
    public static void show01() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力娜扎","160");
        File pathname = new File(new File("").getAbsolutePath(),"src/e.txt");
        //FileOutputStream fos = new FileOutputStream(pathname);
        FileWriter fw = new FileWriter(pathname);
        prop.store(fw,"this is comment");
    }
    public static void show(){
        Properties props = new Properties();
        props.setProperty("Terry","190");
        props.setProperty("Erick","189");
        props.setProperty("shabiLoonger","00");//会去重
        props.setProperty("shabiLoonger","100");
        props.setProperty("Terrance","190");
        Set<String> set = props.stringPropertyNames();
        for(String key:set){
            String value = props.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
