package Comparable;

import java.util.*;

import java.util.ArrayList;

public class CompareToMethod {
    public static void main(String[] args) {
        User user1 = new User("Farid",20);
        User user2 = new User("Nihat",19);
        User user3 = new User("Tarana",29);
        User user4 = new User("Elchin",19);

        List<User> users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        System.out.println(users);

        Collections.sort(users);

        System.out.println(users);
    }
}
