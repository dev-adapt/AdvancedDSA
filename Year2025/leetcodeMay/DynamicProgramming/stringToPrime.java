package Year2025.leetcodeMay.DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class stringToPrime {
    //   public long sumOfLargestPrimes(String s) {
    //     long sum=0;
    //     int count=0;
    //     int n=s.length();
    //     for(int i=n-1;i>=0;i--){  
    //         for(int j=0;j<n;j++){
    //              int curr=0;
    //            if(n-j ==i)curr=Integer.parseInt(s.substring(0,i+1));
    //             if(isPrime(curr) && count<3){
    //                 sum+=curr;
    //                 count++;
    //             }
    //            if(count==3)return sum;
    //         }
    //     }
    //     return sum;
    // }
    public boolean isPrime(long number) {
        // Handle edge cases
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;

        // Eliminate even numbers and multiples of 3 quickly
        if (number % 2 == 0 || number % 3 == 0) return false;

        // Only check for factors up to sqrt(number)
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }

        return true;
    }
 
   
//     public long sumOfLargestPrimes(String s) {
//         Set<Long> st = new HashSet<>();
//         int n = s.length();
        
//         for (int i = 0; i <n; i++) {
//             for (int j = i + 1; j <=n; j++) {
//                 String sub = s.substring(i, j);
//                 long num = Long.parseLong(sub);
//                 if (n > 1 && isPrime(num)) {
//                 st.add(num);
//             }
//             }
//         }

//         if (st.isEmpty()) return 0;

//         List<Long> list = new ArrayList<>(st);
//         list.sort(Collections.reverseOrder());

//         long sum = 0;
//         for (int i = 0; i < Math.min(3, list.size()); i++) {
//             sum += list.get(i);
//         }

//         return sum;
//     }
// }
 public long sumOfLargestPrimes(String s) {
        Set<Long> set = new HashSet<>();
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String sub = s.substring(i, j);
                long n = Long.parseLong(sub);
                if (n > 1 && isPrime(n)) {
                set.add(n);
            }
            }
        }

        if (set.isEmpty()) return 0;

        List<Long> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            sum += list.get(i);
        }

        return sum;
}

}
 public boolean isPrime(long n) {
         if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) return false;
        return true;

    }