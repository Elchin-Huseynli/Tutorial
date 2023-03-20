package polymorphism;

public class Developer extends Employe {
    String position = "Backend Developer";
    String programming_language = "Java";

    void run() {
        System.out.println("Position: " + this.position + "\nProgramming language: " + this.programming_language);
    }
}
