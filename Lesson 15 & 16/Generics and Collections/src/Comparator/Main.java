package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
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

        CompareMethod compareMethod = new CompareMethod();
        System.out.println("Normal: ");
        System.out.print(users);

        Collections.sort(users, compareMethod);
        System.out.println("\nSorted: ");
        System.out.print(users);

        Collections.sort(users, compareMethod.reversed());
        System.out.println("\nSorted and reversed: ");
        System.out.print(users);
    }
}
