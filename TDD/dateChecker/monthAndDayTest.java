import org.junit.*;
import static org.junit.Assert.*;

public class monthAndDayTest{

    @Test
    public void month_march() {
        int expected = 3;
        monthAndDay test_md = new monthAndDay(3, 20);
        int result = test_md.getMonth();
        assertEquals(expected, result);
    }

    @Test
    public void day_20() {
        int expected = 20;
        monthAndDay test_md = new monthAndDay(3, 20);
        int result = test_md.getDay();
        assertEquals(expected, result);
    }

    @Test
    public void season_test() {
        String expected = "spring";
        monthAndDay test_md = new monthAndDay(3, 20);
        String result = test_md.getSeason();
        assertEquals(expected, result);
    }

    @Test
    public void season_winter() {
        String expected = "winter";
        monthAndDay test_md = new monthAndDay(1, 15);
        String result = test_md.getSeason();
        assertEquals(expected, result);
    }
}