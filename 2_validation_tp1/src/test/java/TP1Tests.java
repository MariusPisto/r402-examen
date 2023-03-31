import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TP1Tests {

    // dans JUnit 5, un test est simplement une méthode de type void, marquée avec le tag @Test
    // elle peut avoir n'importe quel nom
    @Test
    void simpleTest() {
        // pour être utile, un test doit comporter au moins une assertion qui vérifie une propriété
        String s = "st" + "tring";
        // cette assertion vérifie que le deuxième argument est égal au premier (le résultat attendu)
        assertEquals("sttring", s);
    }

    @Test
    public void testOverArrays() {
        int[] a = {3, 2, 1};
        int[] expected = {1, 2, 3};

        Arrays.sort(a);
        // cette assertion permet de tester que deux tableaux ont le même contenu
        assertArrayEquals(expected, a);
    }

    @Test
    public void testIndexOfLastOccurrence() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;
        int expected = 4;
        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void testIndexOfLastOccurrenceEmpty() {
        int[] a = {};
        int x = 1;
        int expected = -1;
        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void testIndexOfLastOccurrenceLast() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 10;
        int expected = 9;
        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        int[] a = {};
        double expected = 0.0;
        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageSame() {
        int[] a = {10, 10, 10, 0, 0};
        double expected = 6.0;
        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageDifferent() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double expected = 5.5;
        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOddElements() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int expected = 6;
        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOddElementsWithEvenNegative() {
        int[] a = {1,-2,5,6};
        int expected = 2;
        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOddElementsWithOddNegative() {
        int[] a = {1,-2,5,6,-3};
        int expected = 3;
        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }

}
