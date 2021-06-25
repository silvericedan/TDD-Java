
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {

    private MySet set;

    @BeforeEach
    void setUp() {
        set = new MySet();
    }

    @Test
    public void emptySet() {
        assertTrue(set.isEmpty());
        assertEquals(0, set.size());
    }

    @Test
    public void nonEmptySet() {
        set.add(2);
        set.add(3);
        assertFalse(set.isEmpty());
        assertEquals(2, set.size());
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(5));

    }

    @Test
    public void overflowSet() {
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(8);
        set.add(9);
        assertFalse(set.isEmpty());
        assertEquals(6, set.size());
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(5));

    }

    @Test
    public void uniqueSet() {
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(9);
        assertFalse(set.isEmpty());
        assertEquals(4, set.size());
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(5));

    }

    @Test
    public void removedElementSet() {
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(9);
        assertEquals(4, set.size());
        assertTrue(set.contains(3));
        set.remove(3);
        assertFalse(set.contains(3));
        assertFalse(set.isEmpty());
        assertTrue(set.contains(2));

    }
}
