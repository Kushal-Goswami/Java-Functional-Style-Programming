package org.example.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class User
{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SortUserExample {
    public static void main(String[] args) {

        List<User> users= Arrays.asList(
                new User("Pritam", 25),
                new User("Ramesh", 42),
                new User("Nitin", 10),
                new User("Harry", 15)
        );

//        Comparator<User> userComparator=new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };

        List<User>resultASCAge=users.stream()
                .sorted(((o1, o2) -> o1.getAge() - o2.getAge()))
                .toList();

        System.out.println(resultASCAge);

//        List<User>resultASCAge=users.stream()
//                .sorted(Comparator.comparingInt(User::getAge))
//                .toList();



        List<User>resultDSCAge=users.stream()
                .sorted(((o1, o2) -> o2.getAge() - o1.getAge()))
                .toList();

        System.out.println(resultDSCAge);

      List<User> resultByNameASC= users.stream()
                .sorted(Comparator.comparing(User::getName))
                .toList();

        System.out.println(resultByNameASC);

        List<User> resultByNameDSC= users.stream()
                .sorted(Comparator.comparing(User::getName).reversed())
                .toList();

        System.out.println(resultByNameDSC);
    }
}
