import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
public class SortTest {
    @org.junit.jupiter.api.Test
    void radixSort() throws IOException {
        ArrayList<String> unsorted = new ArrayList<>(Arrays.asList("enthusiasm", "milder", "STENCILED", "LIBELEES", "ReFurbISHMENT", "ComMANDEERs", "spectroscopy", "DiSeMbOdyING", "pAnDErING", "EXPLORATIONS"));
        ArrayList<String> sorted = new ArrayList<>(Arrays.asList("ComMANDEERs", "DiSeMbOdyING", "enthusiasm", "EXPLORATIONS", "LIBELEES", "milder", "pAnDErING", "ReFurbISHMENT", "spectroscopy", "STENCILED"));

        assertEquals(sorted, Sort.radixSort());
        //I tested it out with other lists as dictated by some_file but here's the basic one from the example in GitHub
    }

    @org.junit.jupiter.api.Test
    void toNum() {
        assertEquals(5, Sort.toNum("e"));
        assertEquals(11, Sort.toNum("K"));
        assertEquals(26, Sort.toNum("Z"));
        assertEquals(0, Sort.toNum("ejewfbrejfb"));
        assertEquals(0, Sort.toNum(""));
    }
}
