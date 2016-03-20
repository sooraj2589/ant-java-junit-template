package julenpardo.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void passingTest() {
        assertTrue(true);
    }

    @Test
    public void staticMethodTest() {
        Main.staticMethod();
    }

    @Test
    public void failingTest() {
        // assertTrue(false); // Uncomment this to make the build fail.
    }
}

