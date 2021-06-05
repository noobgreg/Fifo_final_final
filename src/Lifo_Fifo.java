import java.util.Arrays;

public class Lifo_Fifo {

    public static void main(String[] args) {

        Lifo<String> lifo = new Lifo<>(10);
        Lifo<String> lifo_2 = new Lifo<>(10);


        for (int i=0; i<5; i++) {
            lifo_2.push("Knacks" + i);
            lifo.push("Usel" + i);
        }


        Helperclass.move(lifo_2, lifo);
        System.out.println(Arrays.toString(lifo.array));
		/*
		System.out.print("Fifo: ");
		
		for(int i=0; i<fifo.capacity(); i++) {
			System.out.print(fifo.pop());
		}
		System.out.println(" ");
		
		System.out.print("\n" + "Lifo: ");
		for (int i=0; i<lifo.capacity(); i++) {
			System.out.print(lifo.pop());
		}
*/
    }

}