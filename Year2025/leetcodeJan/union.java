import java.util.ArrayList;

import java.util.HashSet;

public class union {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> union = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        
        union.addAll(set);
      
        return union;
    }
}
