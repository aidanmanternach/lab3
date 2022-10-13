import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        CheckerContainsB sc = new CheckerContainsB();
        List<String> arr = new ArrayList<>();
        arr.add("ball");
        arr.add("hi");
        arr.add("bad");
        List<String> expectedArr = new ArrayList<>();
        expectedArr.add("ball");
        expectedArr.add("bad");
        assertEquals(expectedArr, ListExamples.filter(arr, sc));
    }

    @Test
    public void testMerge() {
        List<String> arr1 = new ArrayList<>();
        arr1.add("a");
        arr1.add("b");
        arr1.add("c");
        List<String> arr2 = new ArrayList<>();
        arr2.add("a");
        arr2.add("d");
        arr2.add("f");
        List<String> output = new ArrayList<>();
        output.add("a");
        output.add("a");
        output.add("b");
        output.add("c");
        output.add("d");
        output.add("f");

        assertEquals(output, ListExamples.merge(arr1, arr2));
    }
}