
public class Fifo <T> extends AbstractIntegerBuffer<T> {

    public Fifo(int s) {
        super(s);
    }
    public Fifo() {
        super();
    }

    public T pop() {

        T ret = array[0];

        for(int i=0; i<size-1; i++) {
            array[i] = array[i + 1];
        }
        size--;


        return ret;

    }
}