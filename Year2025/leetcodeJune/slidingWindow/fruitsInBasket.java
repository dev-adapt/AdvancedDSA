import java.util.HashMap;

public class fruitsInBasket {
     public static int totalFruits(int[] fruits) {
        //your code goes here
        HashMap<Integer,Integer>mp=new HashMap<>();
        int l=0,r=0,len=0,n=fruits.length;
        while(r<n){
           if(mp.size()<=2){
            mp.put(fruits[r],r);
           }else{
            mp.put(fruits[r],r);
            while(mp.size()>2){
               l=Math.max(l,mp.get(fruits[l]))+1;
               mp.remove(fruits[l]);
            }
           }
           len=Math.max(len, r-l+1); 
           r++;
        }
        return len;
    }
    public static void main(String[] args) {
        int[]fruits={1,2,3,2,2};
     
        System.out.println(totalFruits(fruits));
    }
}
