import java.util.Random;

public abstract class AbstractIntegerBuffer<T> implements IntegerBuffer<T> {


    protected int size = 0; //Groesse des Speichers
    T[] array; //Speicher vom Integer-Objekten


    //Konstruktor der einen Speicher der Groesse s erzeugt
    @SuppressWarnings("unchecked")
    AbstractIntegerBuffer(int s) {
        array = (T[]) new Object[s];
    }


    //Konstruktor der einen Speicher der zufälligen Groesse zwischen 3 und 100 erzeugt
    @SuppressWarnings("unchecked")
    AbstractIntegerBuffer() {
        int s = new Random().nextInt(100 - 3) + 3;
        array = (T[]) new Object[s];
    }


    //schiebt ein Integer Objekt auf den Speicher wenn freie Kapazität vorhanden
    public void push(T i) {
        if (array.length > size)
            array[size++] = i;
        else
            throw new ArrayIndexOutOfBoundsException("Speicher ist voll!");
    }


    public final int capacity() {
        return array.length;
    }


    public final int size() {

        return size;
    }

}
