public class Student {
    String studentName;
    int studentAge;

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public boolean studentName(String newStudentName) {
        this.studentName = newStudentName;
        return true;
    }

    public boolean newStudentAge(int newStudentAge) {
        this.studentAge = newStudentAge;
        return true;
    }


    public String getInfo(){
        return "StudentName: " + studentName +
                "\nStudentAge: " + studentAge;
    }
}
