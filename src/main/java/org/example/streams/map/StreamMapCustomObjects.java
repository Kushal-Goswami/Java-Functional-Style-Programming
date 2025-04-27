package org.example.streams.map;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class User
{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class StreamMapCustomObjects {
    public static void main(String[] args) {

        List<User>listOfUser=new ArrayList<>();

        listOfUser.add(new User(1, "Kushal", "kg23244", "kg21@gmail.com"));
        listOfUser.add(new User(2, "Ramesh", "ram65344", "ram56@yahoo.com"));
        listOfUser.add(new User(3, "Chahal", "chl7655", "chle344@hotmail.com"));

       List<String>mappedElements= listOfUser.stream()
               .peek(element -> System.out.println(element.toString()))
               .map(element -> element.getEmail())
               .peek(element -> System.out.println(element))
                .toList();

        System.out.println(mappedElements);
    }
}
