import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void one() {
        int expected = 1;

        FizzBuzz test_f = new FizzBuzz(1);
        
        int actual = test_f.getResponse();

        assertEquals(expected, actual);
    }

    @Test 
    public void two() {
        int expected = 2;

        FizzBuzz test_f = new FizzBuzz(2);

        int actual = test_f.getResponse();

        assertEquals(expected, actual);
    }

    @Test
    public void three() {
        String expected = "Fizz";

        FizzBuzz test_f = new FizzBuzz(3);
        
        String actual = test_f.getResponse();

        assertEquals(expected, actual);
    }   
}

