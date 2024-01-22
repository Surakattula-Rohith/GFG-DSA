package gfg.testing.maths;
import com.gfg.practice.maths.SieveOfErathosthenes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class SieveOfErathosthenesTest {
    SieveOfErathosthenes sieveOfErathosthenes = new SieveOfErathosthenes() ;

    @Test
    public void test1(){
        ArrayList<Integer> actual = sieveOfErathosthenes.findPrimes(4) ;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,3));
        assertEquals(actual,expected);
    }

    @Test
    public void test2(){
        ArrayList<Integer> actual = sieveOfErathosthenes.findPrimes(23) ;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19,23));
        assertEquals(actual,expected);
    }
}
