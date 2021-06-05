
public interface IntegerBuffer<T> {

    void push(T i) throws IndexOutOfBoundsException;

    T pop() throws IndexOutOfBoundsException;

    int size();

    int capacity();

}