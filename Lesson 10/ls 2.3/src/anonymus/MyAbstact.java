package anonymus;

public abstract class MyAbstact {
    abstract void run();
    void get() {
        run();
    }

}

class Test {
    public static void main(String[] args) {
        MyAbstact myAbstact = new MyAbstact() {
            @Override
            void run() {
                System.out.println("Salam");
            }
        };
    }
}
