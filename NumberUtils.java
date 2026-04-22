import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Main utility class
class NumberUtils {

    // Factorial method
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Prime check method
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// JUnit test class
public class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    // Test factorial
    @Test
    void testFactorial() {
        assertEquals(120, utils.factorial(5));
    }

    // Test prime (true case)
    @Test
    void testIsPrimeTrue() {
        assertTrue(utils.isPrime(5));
    }

    // Test prime (false case)
    @Test
    void testIsPrimeFalse() {
        assertFalse(utils.isPrime(8));
    }
}