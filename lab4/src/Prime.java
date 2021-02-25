import java.util.List;

import org.apache.commons.math3.primes.Primes;

public class Prime {

    Prime() {
    }

    public boolean checkPrime(int n) {
        return Primes.isPrime(n);
    }

    public int getNextPrime(int n) {
        return Primes.nextPrime(n);
    }

    public List<Integer> getPrimeFactors(int n) {
        return Primes.primeFactors(n);
    }
    
}
