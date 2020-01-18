package search;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by baranipek on 02/04/17.
 */
public class BalancedBracketsTest extends TestCase {


    @Test
    public void testIsBalanced() throws Exception {

        assertTrue(BalancedBrackets.isBalanced("(){}"));

    }

    @Test
    public void testIsNotBalanced() throws Exception {

        assertFalse(BalancedBrackets.isBalanced("(){}["));

    }



}