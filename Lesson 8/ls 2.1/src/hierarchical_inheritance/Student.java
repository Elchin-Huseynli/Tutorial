package hierarchical_inheritance;

public class Student extends Person {
    String profession;

    public Student(String name, String surname, int age, String profession) {
        super(name, surname, age);
        this.profession = profession;

    }

    @Override
    public String toString() {
        return "Student{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
