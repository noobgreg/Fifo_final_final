
public class LifoPaar {


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Lifo lifo = new Lifo();

        lifo.push(new Paar<>(24, "Hendrik"));
        lifo.push(new Paar<>(23, "Gregor"));
        lifo.push(new Paar<>("Gregor", 23));
        lifo.push(new Paar<>("UselKnacks", 420));

        for (int i=0; i<4; i++)
            System.out.println(lifo.pop());

    }

}
