package test;

import junit.framework.TestCase;
import search.SecondLargestNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baranipek on 02/04/17.
 */
public class SecondLargestNumberTest extends TestCase {
    public void testFindSecondLargestNumber() throws Exception {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(5);
        list.add(6);
        list.add(2);

        assertEquals(SecondLargestNumber.findSecondLargestNumber(list).toString(),"5");

    }

}