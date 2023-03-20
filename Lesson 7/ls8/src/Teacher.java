public class Teacher {
    String teacherName;
    int teacherAge;
    String object;

    public Teacher(){}

    public Teacher(String teacherName, int teacherAge, String object) {
        this.teacherName = teacherName;
        this.teacherAge = teacherAge;
        this.object = object;
    }

    public boolean newTeacherName(String newTeacherName) {
        this.teacherName = newTeacherName;
        return true;
    }

    public boolean newTeacherAge(int newTeacherAge) {
        this.teacherAge = newTeacherAge;
        return true;
    }

    public boolean newTeacherObject(String newTeacherObject) {
        this.object = newTeacherObject;
        return true;
    }

    public String getInfo(){
        return "TeacherName: " + teacherName +
                "\nTeacherAge: " + teacherAge +
                "\nObject: " + object;
    }
}
