import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedListTests {
    @Test
    public void testPrepend() {
        LinkedList myList = new LinkedList();
        myList.prepend(1);
        assertEquals("1 ", myList.toString());
    }

    @Test
    public void testAppend() {
        LinkedList myList = new LinkedList();
        myList.prepend(1);
        myList.append(2);
        assertEquals("1 2 ", myList.toString());
    }

    @Test
    public void testFirst() {
        LinkedList myList = new LinkedList();
        myList.prepend(1);
        myList.append(2);
        
    }

    @Test
    public void testLast() {
        
    }

    @Test
    public void testToString() {
        
    }

    @Test
    public void testLength() {
        
    }
}