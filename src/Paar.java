
public class Paar<E,Z> {

    E erstesElement;
    Z zweitesElement;

    public Paar() {

    }

    public Paar(E x, Z y) {
        this.erstesElement = x;
        this.zweitesElement = y;
    }

    public E getErstes() {
        return erstesElement;
    }

    public Z getZweites() {
        return zweitesElement;
    }

    public E setErstes(E e) {
        E temp = erstesElement;
        erstesElement = e;
        return temp;
    }

    public Z setZweites(Z z) {
        Z temp = zweitesElement;
        zweitesElement = z;
        return temp;
    }

    public void setBeide(E e, Z z) {
        setErstes(e);
        setZweites(z);
    }

    public boolean equals(Paar<E,Z> p) {
        if (p.erstesElement.equals(this.erstesElement) && p.zweitesElement.equals(this.zweitesElement))
            return true;
        else
            return false;
    }

    public String toString() {
        return "(" + erstesElement + ", " + zweitesElement + ")";
    }


}