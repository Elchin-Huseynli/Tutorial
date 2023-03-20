package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(91);
        set.add(95);
        set.add(97);
        set.add(100);                                // elementi setə əlavə edir.
        System.out.println(set.size());              // setin ölçüsün qaytarır.
        System.out.println(set.isEmpty());           // setin boş olub-olmadıöın yoxluyur.
        System.out.println(set.contains(91));        // verilmiş elemrntin setdə olub-olmadığını yoxlayır.
        set.remove(95);                           // verilmiş elementi setdən silir.
        set.remove(3);                            // verilmiş indeksdəki elementi silir.
        set.clear();                                 // seti təmizləyir.
        System.out.println(set);
    }
}


/*Setlər listdən fərqli olaraq dublikat element qəbul etmir.*/
