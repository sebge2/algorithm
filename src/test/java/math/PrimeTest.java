package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    public void isPrime0(){
        final boolean actual = Prime.isPrime(0);

        assertFalse(actual);
    }

    @Test
    public void isPrime1(){
        final boolean actual = Prime.isPrime(1);

        assertFalse(actual);
    }

    @Test
    public void isPrime2(){
        final boolean actual = Prime.isPrime(2);

        assertTrue(actual);
    }

    @Test
    public void isPrime3(){
        final boolean actual = Prime.isPrime(3);

        assertTrue(actual);
    }

    @Test
    public void isPrime4(){
        final boolean actual = Prime.isPrime(4);

        assertFalse(actual);
    }

    @Test
    public void isPrime5(){
        final boolean actual = Prime.isPrime(5);

        assertTrue(actual);
    }

    @Test
    public void isPrime6(){
        final boolean actual = Prime.isPrime(6);

        assertFalse(actual);
    }

    @Test
    public void isPrime7(){
        final boolean actual = Prime.isPrime(7);

        assertTrue(actual);
    }

    @Test
    public void isPrime9(){
        final boolean actual = Prime.isPrime(9);

        assertFalse(actual);
    }
}
