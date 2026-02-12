package learningjenkins;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for App class.
 */
public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
public void testMainMethod() {
    System.setOut(new PrintStream(outContent));
    outContent.reset();

    try {
        App.main(new String[]{});
        assertEquals("Hello World!" + System.lineSeparator(), outContent.toString());
    } finally {
        System.setOut(originalOut);
    }
}

@Test
public void testMainMethodWithArguments() {
    System.setOut(new PrintStream(outContent));
    outContent.reset();

    try {
        App.main(new String[]{"arg1", "arg2"});
        assertEquals("Hello World!" + System.lineSeparator(), outContent.toString());
    } finally {
        System.setOut(originalOut);
    }
}

}
