package Object;

public class Demo02Equals {
    public static void main(String ...args){
//        Person p1 = new Person("Terry",18);
//        Person p2 = new Person("Terry",18);
//        p1 = p2;
//        System.out.println(p1 == p2);//true
//        System.out.println(p1);
//        System.out.println(p2);

        Person p1 = new Person("Terry",18);
        Person p2 = new Person("Terry",18);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
