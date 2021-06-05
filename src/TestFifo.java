import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TestFifo {


    Fifo<Integer> iFifo;
    Fifo<String> sFifo;

    @BeforeEach
    void setup() {
        iFifo = new Fifo<>(5);
        sFifo = new Fifo<>(5);
    }

    @AfterEach
    void teardown() {
        iFifo = null;
        sFifo = null;
    }


    @DisplayName("Test Push/Pop Integer")
    @Test
    void testPushPopInteger() {

        Object[] fifo_array = {1, 2, 3, 4, 5};

        for (int i=1; i<=iFifo.size; i++) {
            iFifo.push(i);
            assertEquals(fifo_array[i], iFifo.pop(), "Überprüfe die Methoden pop() und push() in der Fifo Klasse!");
        }
    }

    @DisplayName("Test Push/Pop String")
    @Test
    void testPushPopString() {

        Object[] fifo_array = {"Flex", "Flex", "Flex", "Flex", "Flex"};

        for (int i=0; i<=sFifo.size; i++) {
            sFifo.push("Flex");
            assertEquals(fifo_array[i], sFifo.pop(), "Überprüfe die Methoden pop() und push() in der Fifo Klasse!");
        }
    }


    @DisplayName("Test Size")
    @Test
    void testSize() {

        Object[] iFifo_array = {0, 1, 2, 3, 4};

        int s = 0;
        for (int i=0; i<iFifo_array.length; i++) {
            assertEquals(s, iFifo.size(), "Überprüfe size() in der Fifo Klasse!");
            assertEquals(iFifo_array.length, iFifo.capacity(), "Überprüfe capacity() in der Fifo Klasse!");
            iFifo.push(i);
            s++;
        }
    }

    @DisplayName("Teste ob Pop die richtige Reihenfolge liefert")
    @Test
    void testPop() {

        for (int i=0; i<5; i++) {
            iFifo.push(i);
        }

        Object[] expected_pop = {0, 1, 2, 3, 4};
        Object[] actual_pop = new Object[5];

        for(int i=0; i<5; i++) {
            actual_pop[i] = iFifo.pop();
        }

        assertArrayEquals(expected_pop, actual_pop, "Die Method pop() liefert nicht die erwartete Reihenfolge. Bitte überprüfen!");
    }

    @DisplayName("Teste move() aus der Helperklasse")
    @Test
    void testMove() {
        Fifo<String> iFifo = new Fifo<>(10);
        Fifo<String> sFifo = new Fifo<>(10);

        for (int i=0; i<5; i++) {
            sFifo.push("Pow");
            iFifo.push("Boom");
        }

        Helperclass.move(sFifo, iFifo);

        Object[] expected_move = {"Boom", "Boom", "Boom", "Boom", "Boom", "Pow", "Pow", "Pow", "Pow", "Pow"};

        assertArrayEquals(expected_move, iFifo.array);


    }
}