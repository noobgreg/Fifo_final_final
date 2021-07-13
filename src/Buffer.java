
public interface Buffer<T> {

    // adds an element to the buffer
    void push(T i) throws ArrayIndexOutOfBoundsException;

    // retrieves the next element from the buffer
    T pop() throws ArrayIndexOutOfBoundsException;

    // amount of current elements on the buffer
    int size();

    // maximum capacity of the buffer
    int capacity();

}