package Demo01.BufferedStream;

import java.io.*;
import java.util.HashMap;

public class Test {
    public static void main (String ...args) throws IOException {
        show();
    }
    public static void show()throws IOException {
        File pathname = new File(new File("").getAbsolutePath(),"src/in.txt");
        File dist = new File(new File("").getAbsolutePath(),"src/out.txt");
        HashMap<String,String> map = new HashMap<>();
        FileWriter fw = new FileWriter(dist);
        FileReader fr = new FileReader(pathname);
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine())!=null){
            String [] arr = line.split("\\.");
            map.put(arr[0],arr[1]);//HashMap 会自动排序
        }
        for(String key:map.keySet()){
            String value = map.get(key);
            line = key +"."+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        bw.close();
    }
}
