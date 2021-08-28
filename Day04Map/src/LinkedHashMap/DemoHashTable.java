package LinkedHashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashTable {
    public static void main(String...args){
        hashMap();
        table();
    }
    public static void hashMap(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);
    }
    public static void table(){
        Hashtable<String,String> table = new Hashtable<String,String>();
        table.put(null,"a");//java.lang.NullPointerException
        table.put("b",null);//java.lang.NullPointerException
        table.put(null,null);//java.lang.NullPointerException
        System.out.println(table);
    }
}
