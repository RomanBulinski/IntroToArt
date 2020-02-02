
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ItroTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new String[0], Itro.getW(-5));
        assertArrayEquals(new String[0], Itro.getW(1));
        assertArrayEquals(new String[] {
                "*   *   *",
                " * * * * ",
                "  *   *  "
        }, Itro.getW(3));
        assertArrayEquals(new String[] {
                "*           *           *",
                " *         * *         * ",
                "  *       *   *       *  ",
                "   *     *     *     *   ",
                "    *   *       *   *    ",
                "     * *         * *     ",
                "      *           *      "
        }, Itro.getW(7));
    }
}
