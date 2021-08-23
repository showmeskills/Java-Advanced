package Collections;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class Demo01Collection {
    public static void main(String ... args){
        //创建集合对象，可以使用多态
        Collection<String> collectionList = new ArrayList<>();
        Collection<String> hashList = new HashSet<>();

        boolean b = collectionList.add("Terry");
        System.out.println(b);
        hashList.add("李四");
        hashList.add("李四");
        hashList.add("张三");
        hashList.add("赵五");
        System.out.println(collectionList);
        System.out.println(hashList);

        boolean isExist = hashList.contains("赵五");
        System.out.println(isExist);

    }
}
