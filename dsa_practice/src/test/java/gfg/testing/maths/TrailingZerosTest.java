package gfg.testing.maths;
import com.gfg.practice.maths.TrailingZerosInFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
public class TrailingZerosTest {
    TrailingZerosInFactorial trailingZerosInFactorial = new TrailingZerosInFactorial();
    @Test
    public void test1(){
        int actual = trailingZerosInFactorial.NumberOfTrailingZeros(3) ;
        int expected = 0 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        int actual = trailingZerosInFactorial.NumberOfTrailingZeros(5) ;
        int expected = 1 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test3(){
        int actual = trailingZerosInFactorial.NumberOfTrailingZeros(0) ;
        int expected = 0 ;
        assertEquals(actual,expected);
    }
}
