
public class Helperclass {

    public static <T>void move(IntegerBuffer<T> source, IntegerBuffer<T> sink) {
        while (source.size() > 0) {
            sink.push(source.pop());
        }

    }

}