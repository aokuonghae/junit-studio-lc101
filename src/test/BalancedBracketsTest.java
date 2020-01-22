package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyOneBeginningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyOneEndingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void multipleEmptyBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void unmatchedMultipleEmptyBracketReturnsFalse(){
        assertFalse (BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void stringMatchedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("St[rin]g"));
    }
    @Test
    public void stringUnmatchedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("St[ring"));
    }
    @Test
    public void stringUnmatchedEndingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Stri]ng"));
    }
    @Test
    public void stringMultipleBracketsMatchedReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("St[r[in]g]"));
    }
    @Test
    public void stringMultipleUnmatchedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("St[ri[n]g"));
    }
    @Test
    public void stringNoBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("String"));
    }

}
