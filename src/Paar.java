
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

    public void setErstes(E e) {
        System.out.println(erstesElement);
        this.erstesElement = e;
    }

    public void setZweites(Z z) {
        System.out.println(zweitesElement);
        this.zweitesElement = z;
    }

    public void setBeide(E e, Z z) {
        this.erstesElement = e;
        this.zweitesElement = z;
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