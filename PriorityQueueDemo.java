package Demo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
//    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return - o1.getName().compareTo(o2.getName());
            }
        });
        queue.offer(new Person("aha",12));
        queue.offer(new Person("ff",13));
        queue.offer(new Person("zeze",14));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
