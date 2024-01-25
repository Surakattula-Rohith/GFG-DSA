package gfg.testing;
import com.gfg.practice.maths.DivisorsOfNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class DivisorsOfNumberTest {
    DivisorsOfNumber divisorsOfNumber = new DivisorsOfNumber() ;

    @Test
    public void test1(){
        ArrayList<Integer> actual = divisorsOfNumber.findDivisors(15) ;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,15,3,5));
        assertEquals(actual,expected);
    }

    @Test
    public void test2(){
        ArrayList<Integer> actual = divisorsOfNumber.findDivisors(25) ;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,25,5));
        assertEquals(actual,expected);
    }
}

