package gfg.testing.maths;
import com.gfg.practice.maths.PalindromeNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeNumberTest {
    @Test
    public void test1() {
        PalindromeNumber palindromeNumber = new PalindromeNumber() ;
        boolean actual = palindromeNumber.isPalindrome(100) ;
        boolean expected = false ;
        assertEquals(actual,expected);
    }
    @Test
    public void test2() {
        PalindromeNumber palindromeNumber = new PalindromeNumber() ;
        boolean actual = palindromeNumber.isPalindrome(101) ;
        boolean expected = true ;
        assertEquals(actual,expected);
    }
    @Test
    public void test3() {
        PalindromeNumber palindromeNumber = new PalindromeNumber() ;
        boolean actual = palindromeNumber.isPalindrome(1) ;
        boolean expected = true ;
        assertEquals(actual,expected);
    }
    @Test
    public void test4() {
        PalindromeNumber palindromeNumber = new PalindromeNumber() ;
        boolean actual = palindromeNumber.isPalindrome(0) ;
        boolean expected = true ;
        assertEquals(actual,expected);
    }
}
