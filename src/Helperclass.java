
public class Helperclass {


    /**
     * Moves all elements from one buffer to another
     */
    public static <T>void move(Buffer<T> source, Buffer<T> sink) {

        if(source.size() > sink.capacity() - sink.size()) throw new IllegalArgumentException();

        while (source.size() > 0) {
            sink.push(source.pop());
        }

    }

}