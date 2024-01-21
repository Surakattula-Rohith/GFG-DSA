package gfg.testing.maths;
import com.gfg.practice.maths.GCD;
import org.junit.Test;
import static org.junit.Assert.*;
public class GCDTest {
    GCD gcd = new GCD();

    @Test
    public void test1(){
        int actual = gcd.gcdOfTwoNumbers(48,18) ;
        int expected = 6 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        int actual = gcd.gcdOfTwoNumbers(1,0) ;
        int expected = 1 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test3(){
        int actual = gcd.gcdOfTwoNumbers(0,6) ;
        int expected = 6 ;
        assertEquals(actual,expected);
    }

    @Test
    public void test4(){
        int actual = gcd.lcmOfTwoNumbers(24,30) ;
        int expected = 120 ;
        assertEquals(actual,expected);
    }
}
