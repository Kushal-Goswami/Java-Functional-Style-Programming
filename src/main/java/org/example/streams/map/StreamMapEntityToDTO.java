package org.example.streams.map;

import java.util.ArrayList;
import java.util.List;

class Entity
{
    private int id;
    private String userName;
    private String password;
    private String email;

    public Entity(int id, String userName, String password, String email) {
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

class UserDTO
{
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class StreamMapEntityToDTO {
    public static void main(String[] args) {

        List<Entity> listOfUser=new ArrayList<>();

        listOfUser.add(new Entity(1, "Kushal", "kg23244", "kg21@gmail.com"));
        listOfUser.add(new Entity(2, "Ramesh", "ram65344", "ram56@yahoo.com"));
        listOfUser.add(new Entity(3, "Chahal", "chl7655", "chle344@hotmail.com"));



        List<UserDTO> mappedUserDTO=listOfUser.stream().map(entity -> new UserDTO(entity.getId(), entity.getUserName(), entity.getEmail()))
                .toList();

        mappedUserDTO.forEach(element -> System.out.println(element.toString()));

    }
}
