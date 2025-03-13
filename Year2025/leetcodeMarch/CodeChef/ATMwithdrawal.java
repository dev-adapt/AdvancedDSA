package CodeChef;

import java.util.Scanner;

public class ATMwithdrawal {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt(); // Number of people
            int k = sc.nextInt(); // Total money in ATM
            int personMoney[] = new int[n];
            
            for(int j = 0; j < n; j++) {
                personMoney[j] = sc.nextInt();
            }
            
            StringBuilder ans = new StringBuilder();
            for(int j = 0; j < n; j++) {
                processWithdrawal(k, personMoney[j], ans);
                if (k >= personMoney[j]) {
                    k -= personMoney[j]; // Update remaining money in ATM
                }
            }
            
            System.out.println("this is the answer " + ans);
        }
        
        sc.close(); // Close scanner to avoid resource leak
    }

    private static void processWithdrawal(int k, int current, StringBuilder s) {
        if(k >= current) {
            s.append("1"); // Successful withdrawal
        } else {
            s.append("0"); // Unsuccessful withdrawal
        }
    }
}
