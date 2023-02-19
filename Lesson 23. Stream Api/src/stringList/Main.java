package stringList;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Elchin",19),
                new User("Nihat",19),
                new User("Xedice",19),
                new User("Farid",20),
                new User("Terane",29)
        );

        List<String> list = users.stream()
                .filter(user -> user.name.length()>5)
                .map(user -> user.name)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
