import java.util.*;

public class Super_Ugly_Number {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] count = new int[primes.length];
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * res[count[j]]);
            }
            res[i] = min;
            for (int j = 0; j < count.length; j++) {
                if (res[count[j]] * primes[j] == min) {
                    count[j]++;
                }
            }
        }
        return res[n - 1];
    }
    
    public static void main(String[] args){
    	int[] nums={2,7,13,19};
    	nthSuperUglyNumber(12,nums);
    }
}
