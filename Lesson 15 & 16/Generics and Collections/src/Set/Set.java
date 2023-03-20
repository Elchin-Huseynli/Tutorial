package Set;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add(896);
        set.add(896);
        set.add(true);

        for (Object set1 : set) {
            System.out.println(set1);
        }
        System.out.println(set.size());

        //Listdən fərqli olaraq dublikat elementləri çap etmir.
    }
}
