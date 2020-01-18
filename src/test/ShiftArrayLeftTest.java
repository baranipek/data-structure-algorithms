package test;

import org.junit.Test;
import search.ShiftArrayLeft;

import static org.junit.Assert.assertArrayEquals;

public class ShiftArrayLeftTest {

    @Test
    public void givenArray_WhenRotateLeft_ArrayIsRotated()  {
        int [] array = {1,3,5,6};
        int [] expected  = {5,6,1,3};
        int [] actual = ShiftArrayLeft.rotLeft(array,2);

        assertArrayEquals(actual,expected);
    }
}
