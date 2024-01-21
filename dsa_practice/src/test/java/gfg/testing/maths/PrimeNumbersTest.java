package gfg.testing.maths;
import com.gfg.practice.maths.PrimeNumbers;
import org.junit.Test;
import static org.junit.Assert.*;
public class PrimeNumbersTest {
    PrimeNumbers primeNumbers = new PrimeNumbers();
    @Test
    public void test1(){
        boolean actual = primeNumbers.isPrime(13);
        boolean expected = true ;
        assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        boolean actual = primeNumbers.isPrime(24);
        boolean expected = false ;
        assertEquals(actual,expected);
    }
    @Test
    public void test3(){
        boolean actual = primeNumbers.isPrime(25);
        boolean expected = false ;
        assertEquals(actual,expected);
    }
    @Test
    public void test4(){
        boolean actual = primeNumbers.isPrime(26);
        boolean expected = false ;
        assertEquals(actual,expected);
    }

}
