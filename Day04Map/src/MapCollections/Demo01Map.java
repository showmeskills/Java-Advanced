package MapCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String ...args){
        //methodPut();
        //methodRemove();
        //methodGet();
        methodContainsKey();
    }
    public static void methodContainsKey(){
        Map<Character,String> hMap = new HashMap<>();
        hMap.put('0',"Terry");
        hMap.put('1',"Terrance");
        hMap.put('2',"Dora");

       boolean k = hMap.containsKey('2');
        System.out.println(k);
    }
    public static void methodGet(){
        Map<Character,String> hMap = new HashMap<>();
        hMap.put('0',"Terry");
        hMap.put('1',"Terrance");
        hMap.put('2',"Dora");
        String name = hMap.get('1');
        System.out.println(name);
    }
    public static void methodRemove(){
        Map<Character,String> hMap = new HashMap<>();
        String v = hMap.put('0',"Terry");
        hMap.put('1',"Terrance");
        hMap.put('2',"Dora");
        String removeItem = hMap.remove('1');
        System.out.println(hMap);
        System.out.println(v);
        System.out.println(removeItem);
        Map<Character,String> lHashMap = new LinkedHashMap<>();
        lHashMap.put('0',"Terry");
        lHashMap.put('1',"Terrance");
        lHashMap.put('2',"Dora");
        String name = lHashMap.remove('2');
        System.out.println(name);
        System.out.println(lHashMap);
    }
    public static void methodPut(){
        Map<Character,String> hMap = new HashMap<>();
        String v = hMap.put('0',"Terry");
        hMap.put('1',"Terrance");
        hMap.put('2',"Dora");
        System.out.println(hMap);
        System.out.println(v);
        Map<Character,String> lHashMap = new LinkedHashMap<>();
        lHashMap.put('0',"Terry");
        lHashMap.put('1',"Terrance");
        lHashMap.put('2',"Dora");
        System.out.println(lHashMap);
    }
}
