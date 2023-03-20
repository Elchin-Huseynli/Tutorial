package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C++");
        list.add("C#");
        list.add("C");
        list.add("Java");                               // listə element əlavə edir.
        list.add(0, "Python");             // verilən indeksə element əlavə edir.
        System.out.println(list.get(0));                // verilmiş indeksdəki elementi qaytarır.
        System.out.println(list.size());                // listin ölçüsün qaytarır.
        System.out.println(list.isEmpty());             // listin boş olub olmadığın yoxluyur.
        System.out.println(list.contains("Java"));      // verilmiş elementin listdə olub-olmamasını yoxluyur.
        list.remove("Python");                       // elementi listdən silir.
        list.remove(0);                           // indeksə uyğun elementi listdən silir.
        System.out.println(list.indexOf("C++"));        // elemrntin indeksin qaytarır
        list.clear();                                   // listi təmizləyir.
        System.out.println(list);
    }
}