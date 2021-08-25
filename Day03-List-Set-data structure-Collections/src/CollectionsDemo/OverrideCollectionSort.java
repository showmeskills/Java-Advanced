package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class OverrideCollectionSort {
    public static void main(String ...args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
        Collections.sort(list,(Integer o1,Integer o2)->o2-o1);
        System.out.println(list);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Terry",15));
        students.add(new Student("Terry1",18));
        students.add(new Student("Terry2",20));
        students.add(new Student("Terry3",16));
        Collections.sort(students,(Student s1,Student s2)-> s1.getAge() - s2.getAge());
        System.out.println(students);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Terry",15));
        persons.add(new Person("Terry1",19));
        persons.add(new Person("Terry2",14));
        persons.add(new Person("Terry3",11));
        persons.add(new Person("Terry4",110));
        Collections.sort(persons);
        System.out.println(persons);
        

    }
}
