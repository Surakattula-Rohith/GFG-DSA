package gfg.testing;
import com.gfg.practice.maths.PowerFunction;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class PowerFunctionTest {
    PowerFunction powerFunction = new PowerFunction() ;
    @Test
    public void test1(){
        long actual = powerFunction.power(6,2);
        long expected = 36 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        long actual = powerFunction.power(0,1);
        long expected = 0 ;
        assertEquals(actual,expected);
    }
    @Test
    public void test3(){
        long actual = powerFunction.power(1,0);
        long expected = 1 ;
        assertEquals(actual,expected);
    }

}
