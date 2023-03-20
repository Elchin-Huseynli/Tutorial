package user.model;

import user.service.UserService;

public class User extends UserService {
    String name;
    String birthday;
    String position;


    @Override
    public boolean register() {
        name = "Elchin";
        birthday = "27.12.2003";
        position = "Backend Developer";

        return true;
    }

    @Override
    public void show() {
        System.out.println("Name: " + name + "\nBirthday: " + birthday + "\nPosition: " + position);
    }
}
