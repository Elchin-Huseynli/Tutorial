package singletonPattern;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.setName("Elchin");
        person.setAge(19);

        Person person1 = Person.getInstance();

        System.out.println(person);
        System.out.println(person1);
    }
}