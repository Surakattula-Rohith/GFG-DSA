package gfg.testing.maths;
import com.gfg.practice.maths.FactorialOfNumber;
import org.junit.Test;
import static org.junit.Assert.*;
public class FactorialOfNumberTest {

    FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
    @Test
    public void test1(){
        long actual = factorialOfNumber.FactorialByIterativeMethod(5);
        long expected = 120 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        long actual = factorialOfNumber.FactorialByIterativeMethod(0);
        long expected = 1 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test3(){
        long actual = factorialOfNumber.FactorialByIterativeMethod(1);
        long expected = 1 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test4(){
        long actual = factorialOfNumber.FactorialByIterativeMethod(15);
        long expected = (long)1307674368000L ;
        assertEquals(actual,expected);
    }
    @Test
    public void test5(){
        long actual = factorialOfNumber.FactorialByRecursiveMethod(5);
        long expected = 120 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test6(){
        long actual = factorialOfNumber.FactorialByRecursiveMethod(0);
        long expected = 1 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test7(){
        long actual = factorialOfNumber.FactorialByRecursiveMethod(1);
        long expected = 1 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test8(){
        long actual = factorialOfNumber.FactorialByRecursiveMethod(15);
        long expected = (long)1307674368000L ;
        assertEquals(actual,expected);
    }
}
