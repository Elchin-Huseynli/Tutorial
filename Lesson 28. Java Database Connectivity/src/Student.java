import java.time.LocalDate;

public class Student {
    int id;
    String name;
    String surname;
    String major;
    int fee;
    LocalDate startDate;

    public Student(int id, String name, String surname, String major, int fee, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.major = major;
        this.fee = fee;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", major='" + major + '\'' +
                ", fee=" + fee +
                ", startDate=" + startDate +
                '}';
    }
}
