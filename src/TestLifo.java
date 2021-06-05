
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

//import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestLifo {

    Lifo<Integer> iLifo = null;
    Lifo<String> sLifo = null;

    @BeforeEach
    void setup() {
        iLifo = new Lifo<Integer>(5);
        sLifo = new Lifo<String>(5);
    }

    @AfterEach
    void teardown() {
        iLifo = null;
        sLifo = null;
    }

    @DisplayName("Teste Push/Pop fuer Integer")
    @Test
    void testPushPopInteger() {

        Integer[] iLifo_array = {0, 1, 2, 3, 4};

        //for-schleife um ein array von 0-4 zu erzeugen mit der methode push(i)
        for (int i=0; i<iLifo.size; i++) {
            iLifo.push(i);
            assertEquals(iLifo_array[i], iLifo.pop(), "Überprüfe die Methode pop() in der Lifo Klasse!");
        }

    }

    @DisplayName("Teste Push/Pop fuer String")
    @Test
    void testPushPopString() {

        String[] sLifo_array = {"Usel", "Usel", "Usel", "Usel", "Usel"};

        //for-schleife um ein array von 0-4 zu erzeugen mit der methode push(i)
        for (int i=0; i<sLifo.size; i++) {
            sLifo.push("Usel");
            assertEquals(sLifo_array[i], sLifo.pop(), "Überprüfe die Methode pop() in der Lifo Klasse!");
        }

    }


    @DisplayName("Teste Size")
    @Test
    void testSize() {

        Object[] lifo_array = {0, "Usel", 2, 3, 4};

        int s = 0;
        for (int i=0; i<lifo_array.length; i++) {
            assertEquals(s, iLifo.size(), "Überprüfe size()!");
            assertEquals(s, sLifo.size(), "Überprüfe size()!");
            assertEquals(lifo_array.length, iLifo.capacity(), "Überprüfe die Methode capacity() in der Fifo Klasse!");
            assertEquals(lifo_array.length, sLifo.capacity(), "Überprüfe die Methode capacity() in der Fifo Klasse!");
            iLifo.push(i);
            sLifo.push("Usel");
            s++;
        }
    }


    @Test
    void testPop() {

        for (int i=0; i<5; i++) {
            sLifo.push("Knacks");
        }

        Object[] expected_pop = {"Knacks", "Knacks", "Knacks", "Knacks", "Knacks"};
        Object[] actual_pop = new Object[5];

        for(int i=0; i<5; i++) {
            actual_pop[i] = sLifo.pop();
        }

        assertArrayEquals(expected_pop, actual_pop, "Die Method pop() liefert nicht die erwartete Reihenfolge. Bitte überprüfen!");
    }


    @DisplayName("Teste move() aus der Helperklasse")
    @Test
    void testMove() {
        Lifo<Integer> iLifo_one = new Lifo<>(10);
        Lifo<Integer> iLifo_two = new Lifo<>(10);

        for (int i=0; i<5; i++) {
            iLifo_one.push(i);
            iLifo_two.push(i);
        }

        Helperclass.move(iLifo_one, iLifo_two);

        Object[] expected_move = {0, 1, 2, 3, 4, 4, 3, 2, 1, 0};

        assertArrayEquals(expected_move, iLifo_two.array);


    }

}