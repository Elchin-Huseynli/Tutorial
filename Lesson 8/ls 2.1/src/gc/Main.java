package gc;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Elchin", "18");
        Student student2 = new Student("Nihat", "19");
        Student student3 = new Student("Xedice", "19");
        Student student4 = new Student("Leman", "20");
        Student student5 = new Student("Nurlan", "19");

        {
            student3 = student4 = null;

            System.gc();
            System.runFinalization();
        }

        student5.showID();
    }
}
