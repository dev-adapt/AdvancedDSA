import java.util.HashMap;

public class freq {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i, 0)+1 );
        }
        for(int i:nums){
           if(prime( mp.get(i)))return true;
        }
        return false;
    }
    public boolean prime(int num){
        int count=0;
        if(num==1)return false;
        if(num==3 || num==2)return true;
        if(num%2==0 || num%3==0)return false;
        for(int i=2;i<num;i++){
            if(num%i==0)return false;
        }
        return true;
    }
}
