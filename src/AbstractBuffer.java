import java.util.Random;

public abstract class AbstractBuffer<T> implements Buffer<T> {


    protected int size = 0; //Groesse des Speichers
    T[] array; //Speicher vom Integer-Objekten


    //Konstruktor der einen Speicher der Groesse s erzeugt
    @SuppressWarnings("unchecked")
    public AbstractBuffer(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException();

        array = (T[]) new Object[capacity];
    }


    //Konstruktor der einen Speicher der zufälligen Groesse zwischen 3 und 100(inklusive) erzeugt
    @SuppressWarnings("unchecked")
    public AbstractBuffer() {
        int s = new Random().nextInt(100 - 3) + 3;
        array = (T[]) new Object[s];
    }


    //schiebt ein Integer Objekt auf den Speicher wenn freie Kapazität vorhanden
    public void push(T i) {
        if (array.length > size) {
            array[size++] = i;
        } else {
            throw new ArrayIndexOutOfBoundsException("Speicher ist voll!");
        }
    }


    public int capacity() {
        return array.length;
    }


    public int size() {

        return size;
    }

}
