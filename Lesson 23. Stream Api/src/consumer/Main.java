package consumer;

public class Main {
    public static void main(String[] args) {
        CustomConsumer<Integer> customConsumer = System.out::println;
        customConsumer.run(95);
    }
}
