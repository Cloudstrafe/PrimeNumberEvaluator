import main.java.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void happyPathPrimeNumbers() {
        assertTrue(Main.isPrime(5), "5 is not a prime number");
        assertTrue(Main.isPrime(7), "7 is a prime number");
        assertTrue(Main.isPrime(163), "163 is a prime number");
    }

    @Test
    public void happyPathNotPrimeNumbers() {
        assertFalse(Main.isPrime(4), "4 is not a prime number");
        assertFalse(Main.isPrime(63), "63 is not a prime number");
        assertFalse(Main.isPrime(1348), "1348 is a prime number");
    }

    @Test
    public void exceptionCaughtWhenInputNotAnInteger() {
        String[] args = new String[1];
        args[0] = "ad";
        try {
            Main.main(args);
            fail("Exception was not thrown");
        } catch (NumberFormatException e) {
        }
    }
}
