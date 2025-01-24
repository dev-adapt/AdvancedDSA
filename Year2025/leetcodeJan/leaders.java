import java.util.ArrayList;
import java.util.Collections;

public class leaders {
       static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length , max=arr[n-1];
        list.add(max);
        for(int i=n-2;i>=0;i--) {      
            if(arr[i]>max){
                max=arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
