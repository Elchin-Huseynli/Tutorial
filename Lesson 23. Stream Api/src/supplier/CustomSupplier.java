package supplier;
@FunctionalInterface
public interface CustomSupplier<T> {
    T get();
}
