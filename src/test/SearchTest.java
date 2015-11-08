package test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import search.BinarySearch;

public class SearchTest {

    private static int[] array = {1, 2, 3, 4, 5, 6};

    private BinarySearch binarySearch;

    @Before
    public void setup() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void test_searchInArray() {
        int result = binarySearch.searchInArray(array, 6, 4);
        Assert.assertEquals(result, 3);

    }

    @Test
    public void test_recursiveBinarySearch() {
        int result = binarySearch.recursiveBinarySearch(array,0,array.length,3);
        Assert.assertEquals(result, 2);

    }
}
