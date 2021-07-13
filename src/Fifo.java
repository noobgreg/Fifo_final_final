
public class Fifo <T> extends AbstractBuffer<T> {

    // fifo constructor with argument
    public Fifo(int s) {
        super(s);
    }

    // fifo constructor without argument
    public Fifo() {
        super();
    }

    @Override
    public T pop() {

        if(size == 0) throw new ArrayIndexOutOfBoundsException();

        // return first element
        T ret = array[0];

        //copy array
        System.arraycopy(array, 1, array, 0, size - 1);
        size--;


        return ret;

    }
}