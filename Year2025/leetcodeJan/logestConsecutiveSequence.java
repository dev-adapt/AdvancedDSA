import java.util.HashSet;

public class logestConsecutiveSequence {
    public static int longestSequence(int arr[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int cnt=0;
        int longest=0;
        for(int curr:set){
            if(!set.contains(curr-1)){
                cnt=1;
                int x=curr;

                while(set.contains(x+1)){
                    cnt++;
                    x+=1;
                }
            }
            longest=Math.max(cnt,longest);
        }
        return longest;
    }
}
