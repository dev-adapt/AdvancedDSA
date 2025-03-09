package leetcodePractice;

public class closestPrimesInRange {
    public static int[] closestPrimes(int left, int right) {
        int p1=-1,p2=-1;
        int diff=Integer.MAX_VALUE;
        int last=-1;
        for(int i=left;i<=right;i++){
 
          if(isPrime(i)){
            if(p1==-1)p1=i;
            else if(p2==-1){
                p2=i;
                diff=p2-p1;
            }
            else {
                int currDiff=i-p2;
               
                if(currDiff<diff){
                    diff=currDiff;
                    p1=p2;
                    p2=i;
                }else if(last!=-1){
                    if(i-last <diff){
                        diff=i-last;
                        p1=last;
                        p2=i;
                    }
                }
                    last=i;
                
            }
          }
        }
        if(p1==-1 || p2==-1) return new int[]{-1,-1};
      return new int[]{p1,p2};
    }

    //4 5 6 7 8 9 10 11 12
    public static boolean isPrime(int n){
      
        // If n <= 1, return false.
        if (n <= 1) return false;

        // If n is 2 or 3, return true.
        if (n <= 3) return true;

        // If n is even or divisible by 3, return false.
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Iterate from 5 to √n, checking only numbers of the form 6k ± 1 (i.e., 5, 7, 11, 13,...), 
        //since all primes greater than 3 fit this pattern.
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;

   
  }
  public static void main(String[] args) {
    int left = 19, right = 31;
    int ans[]=closestPrimes(left, right);
    System.out.println(ans[0]+" "+ ans[1]);
  }
}
