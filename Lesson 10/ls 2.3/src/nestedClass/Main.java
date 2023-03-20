package nestedClass;

public class Main {
    public static void main(String[] args) {
        Employee.Developer developer = new Employee.Developer();
        developer.position = "Backend";
        developer.id = 19;
        System.out.println("Position: " + developer.position + "\nId: " + developer.id);
    }
}