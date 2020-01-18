package test;

import org.junit.Test;
import search.Fibonacci;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void given5thFibonacciNumber_WhenFibonacciRecursive_ThenReturnEight()  {

        assertEquals(Fibonacci.fibonacciRecursive(6),8);

    }

    @Test
    public void given5thFibonacciNumber_WhenfibonacciIterative_ThenReturnEight()  {

        assertEquals(Fibonacci.fibonacciIterative(6),8);

    }
}
