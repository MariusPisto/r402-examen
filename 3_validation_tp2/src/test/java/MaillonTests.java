import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaillonTests {
    @Test
    public void testConstructeurs() {
        assertThrows(NullPointerException.class, Maillon::new);
        
        Maillon<String> a = new Maillon<String>();
        a.ajouter("a");

        assertThrows(NullPointerException.class, () -> new Maillon<String>("test"));
        assertThrows(NullPointerException.class, () -> new Maillon<String>("test", a));
    }

    @Test
    public void testGetValeur() {
        Maillon<String> a = new Maillon<String>();
        a.ajouter("a");

        assertEquals("a", a.getValeur(0));
    }

    @Test
    public void testSetValeur() {
        Maillon<String> a = new Maillon<String>();
        a.ajouter("a");

        a.setValeur(0, "b");
        assertEquals("b", a.getValeur(0));
    }

    @Test
    public void testAjouter() {
        Maillon<String> a = new Maillon<String>();
        a.ajouter("a");

        a.ajouter("b");
        assertEquals("b", a.getValeur(1));
    }

    @Test
    public void testTaille() {
        Maillon<String> a = new Maillon<String>();
        a.ajouter("a");

        assertEquals(1, a.taille());
    }

    @Test
    public void testContient() {
        Maillon<String> a = new Maillon<String>();
        a.ajouter("a");

        assertEquals(1, a.contient("a"));
    }

    @Test
    public void testContientPas() {
        Maillon<String> a = new Maillon<String>();
        a.ajouter("a");

        assertEquals(-1, a.contient("b"));
    }

    @Test
    public void testUnion() {
        Maillon<String> a = new Maillon<String>();
        a.ajouter("a");
        Maillon<String> b = new Maillon<String>();
        b.ajouter("b");

        a.union(b);
        assertEquals("a", a.getValeur(0));
        assertEquals("b", a.getValeur(1));
    }
}
