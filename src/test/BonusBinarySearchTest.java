package test;

import org.junit.Before;
import org.junit.Test;
import main.BonusBinarySearch;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    BonusBinarySearch test_search;
//    @Before
//    public void createArray(){
//         test_search = new BonusBinarySearch();
//    }
    @Test
    public void searchReturnsIndex(){
        int n = 3;
        int[] test ={0, 1, 2, 3, 4, 5};
        assertEquals(3, BonusBinarySearch.binarySearch(test,3));
    }
    @Test
    public void searchReturnsFalseIfNumberHigherThanIndex(){
        int n=6;
        int[] test={0, 1,2,3,4,5};
        assertEquals(-1, BonusBinarySearch.binarySearch(test,n));
    }
    @Test
    public void searchReturnsFalseIfNumberLessThanIndex(){
        int n=-1;
        int[] test={0, 1,2,3,4,5};
        assertEquals(-1, BonusBinarySearch.binarySearch(test, n));
    }
}
