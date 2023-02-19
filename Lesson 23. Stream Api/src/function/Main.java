package function;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
             new User("Elchin",19),
             new User("Nihat",19),
             new User("Farid",18),
             new User("Terane",29)
        );

        List<String> list = users.stream()
                .filter(user -> user.age>18)
                .map(user -> user.name)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
