package leetcodeAugustAndSeptember;

public class XORqueries {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[]ans=new int[queries.length];
    //    String[]s=new String[arr.length];
        int idx=0;
     
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0],end=queries[i][1];
            int currAns=0;
            for(int j=start;j<=end;j++){
                currAns^=arr[j];
            }
            ans[idx++]=currAns;
        }
        return ans;
    }
}
