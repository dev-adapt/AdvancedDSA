import java.util.ArrayList;

public class factorial {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long>list=new ArrayList<>();
        list.add((long)1);
        for(int i=1;i<n;i++){
            long curr=list.get(i-1);
            long num=curr*(i+1);
            if(num<=n)list.add(num);
            else break;
        }
        return list;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(factorialNumbers(n));
    }
}
