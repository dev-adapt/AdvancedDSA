import java.util.*;
public class WinnerCircularGame {
    public static int findTheWinner(int n, int k) {
        Queue<Integer>q= new LinkedList<>();
        int currK=k;
        for(int i=1;i<=n;i++)q.offer(i);
        while(q.size()>1){
            currK--;
            if(currK!=0){
                q.add(q.remove());
                //currK--;
            }else{
                q.remove();
                currK=k;
            }
        }
        return q.peek();
    }
    public static void main(String[] args) {
        int n=3,k=1;
       System.out.println(findTheWinner(n, k));
       
    }
}
