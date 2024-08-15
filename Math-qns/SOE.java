import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static List<Integer> findPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }

    public static void main(String[] args) {
        int n = 100; // Find primes up to 100
        List<Integer> primes = findPrimes(n);
        System.out.println("Prime numbers up to " + n + ":");
        System.out.println(primes);
    }
}
