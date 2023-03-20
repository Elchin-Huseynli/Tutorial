public class Employe {
    String fullName;
    String position;
    int age;
    double salary;

    public Employe() {}

    public Employe(String fullName, String position, int age, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public String getInfo(){
        return "Fullname: " + fullName +
                "\nPosition: " + position +
                "\nAge: " + age +
                "Salary: " + salary;
    }

    public boolean newFullName(String newFullName) {
        this.fullName=newFullName;
        return true;
    }

    public boolean newPosition(String newPosition) {
        this.position=newPosition;
        return true;
    }

    public boolean newAge(int newAge) {
        this.age=newAge;
        return true;
    }

    public boolean newSalary(double newSalary) {
        this.salary=newSalary;
        return true;
    }
}
