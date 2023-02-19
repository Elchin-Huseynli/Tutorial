package consumer;
@FunctionalInterface
public interface CustomConsumer<T> {
    void run(T t);
}
