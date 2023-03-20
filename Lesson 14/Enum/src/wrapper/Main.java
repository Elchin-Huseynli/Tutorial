package wrapper;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt("19"); // primitiv tipe kecmek ucun
        Integer b = Integer.valueOf("18"); // referans tipine kecmek ucun
        System.out.println(a);
        System.out.println(b);

        System.out.println("---");


        int i = 5; // methodlari yoxdur
        Integer j = 6; // methodlari var
        System.out.println(i);
        System.out.println(6 + j.toString());
    }
}
