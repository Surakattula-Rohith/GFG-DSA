package gfg.testing;
import com.gfg.practice.maths.CountDigits;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountDigitsTest {
    @Test
    public void test1() {
        CountDigits countDigits = new CountDigits() ;
        int actual = countDigits.CountDigits(100) ;
        int expected = 3 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test2() {
        CountDigits countDigits = new CountDigits() ;
        int actual = countDigits.CountDigits(0) ;
        int expected = 1 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test3() {
        CountDigits countDigits = new CountDigits() ;
        int actual = countDigits.CountDigits(5) ;
        int expected = 1 ;
        assertEquals(actual,expected);
    }
}
