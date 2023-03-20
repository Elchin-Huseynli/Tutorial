package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C++");
        map.put(4,"C#");
        map.put(5,"JavaScript");                        // verdiyimiz key və valueni mapə əlavə edir.
        System.out.println(map.get(4));                 // verdiyimiz keyə uyöun elementi qaytarır.
        System.out.println(map.entrySet());             // həm keyi, həm də valueni saxlayır özündə və çap edə bilərik.
        System.out.println(map.size());                 // mapin ölçüsün qayatarır.
        System.out.println(map.containsKey(5));         // verilmiş keyin mapdə olub-olmadığın yoxlayır.
        System.out.println(map.remove(4));          // verilmiş keyə uyğun elementi silir.
        System.out.println(map.remove(2,"Python"));     // verilmiş keyi və valueyə uyğunu silir.
        System.out.println(map);
    }
}
