package SetCollection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String ...args){
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女",18);
        Person p2 = new Person("小美女",18);
        Person p3 = new Person("小美女",19);
        System.out.println(p1.hashCode());//734175839
        System.out.println(p2.hashCode());//734175839
        System.out.println(p3.hashCode());//734175840

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
