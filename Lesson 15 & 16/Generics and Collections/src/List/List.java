package List;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("car");
        list.add(124);
        list.add(124);
        list.add(34.89);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
