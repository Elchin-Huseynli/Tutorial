package animal;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal snace = new Snace();
        dog.voice();
        cat.voice();
        snace.voice();
    }
}
