public class Lifo<T> extends AbstractIntegerBuffer<T> {

    public Lifo(int s) {
        super(s);
    }
    public Lifo() {
        super();
    }

    public Lifo(Paar<Integer, String> paar) {

    }
    public T pop() {
        if(size>0)
            return array[--size];
        else
            throw new IndexOutOfBoundsException();

    }
}