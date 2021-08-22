package Object;

public class Demo01ToString {
    public static void main(String...args){
        Person person = new Person("Terry",33);
        String personStr = person.toString();
        System.out.println(personStr);//Person:{name:Terry,age:33} after override toString method
        System.out.println(person.hashCode());


    }
}
