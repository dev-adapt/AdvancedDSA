import java.util.ArrayList;
import java.util.HashMap;

public class XORk {
     public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer ,Integer>map=new HashMap<>();
        int count=0;
        int XR=0;
        map.put(XR,1);
        for(int i:A){
            XR=XR^i;
            int x=XR^B;
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            map.put(XR,map.getOrDefault(XR,0)+1);
        }
        return count;
    }
}
