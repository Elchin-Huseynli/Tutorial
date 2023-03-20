package hierarchical_inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Elchin","Huseynli",18,"IT");
        Teacher teacher = new Teacher("Farid","Tahmazov",20,"IT");
        System.out.println(student);
        System.out.println("--------------------------------------------------------------");
        System.out.println(teacher);
    }
}
