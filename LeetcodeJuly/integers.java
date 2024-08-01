public class integers {
    public int minChanges(int n, int k) {
        if((n|k)!=n)return -1;
        int changes=0;
        int diff=n^k;
        while(diff>0){
            changes+=(diff&1);
            diff>>=1;
 }
 return changes;
}
}
