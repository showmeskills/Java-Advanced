package Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person(){};
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public boolean equals(Object obj){
       if(this == obj){
           return true;
       }
       if(obj == null){
           return false;
       }
       if(obj instanceof Person){
           Person person = (Person)obj;
           return this.name.equals(person.name) && this.age == person.age;
       }
       return false;
    }
}
