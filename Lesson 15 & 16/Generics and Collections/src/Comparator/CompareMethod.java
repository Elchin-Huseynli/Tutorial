package Comparator;

import java.util.Comparator;

public class CompareMethod implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.age>o2.age){
            return 1;
        }
        else if (o1.age==o2.age){
            return 0;
        }
        else {
            return -1;
        }
    }

    @Override
    public Comparator<User> reversed() {
        return Comparator.super.reversed();
    }
}
