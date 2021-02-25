import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimetTest {
    @Test
    public void Check_11_Is_Prime() {
        Prime number = new Prime();
        boolean isPrime = number.checkPrime(11);
        assertTrue(isPrime);

    }
    

    @Test
    public void Check_9_Is_Not_Prime() {
        Prime number = new Prime();
        boolean isPrime = number.checkPrime(9);
        assertFalse(isPrime);

    }

    @Test
    public void Check_After12_Smallest_Prime_Is_13() {
        Prime number = new Prime();
        int nextPrime = number.getNextPrime(12);
        assertEquals(13, nextPrime);

    }

    @Test
    public void Check_After_25_next_Prime_Not_27() {
        Prime number = new Prime();
        int nextPrime = number.getNextPrime(25);
        assertNotEquals (27, nextPrime);
       
    }


    @Test
    public void Nine_Has_Prime_Factors() {
        Prime number = new Prime();
        List<Integer> list = number.getPrimeFactors(9);
       assertNotNull(list);
        
       
    }


}
