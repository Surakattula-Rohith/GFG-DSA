package gfg.testing.maths;
import com.gfg.practice.maths.PrimeFactors;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class PrimeFactorsTest {
    PrimeFactors primeFactors  = new PrimeFactors() ;

    @Test
    public void test1(){
        ArrayList<Integer> actual = primeFactors.findPrimeFactors(450) ;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,3,3,5,5));
        assertEquals(actual,expected);
    }
}
