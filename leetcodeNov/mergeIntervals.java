import java.util.*;
public class mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]); // Sort by endpoint
            } else {
                return Integer.compare(a[0], b[0]); // Sort by start point if endpoints are equal
            }
        });
        ArrayList<int[]>ans=new ArrayList<>();
        int i=0,n=intervals.length;
        while(i<n){
            if(i+1<n &&((intervals[i][1]>=intervals[i+1][0])&&(intervals[i][0]<intervals[i+1][0]))){
                System.out.println(intervals[i][1]+"  "+intervals[i+1][0]);
                int arr[]=new int[2];
                arr[0]=intervals[i][0];
                arr[1]=intervals[i+1][1];
                ans.add(arr);
                i+=2;
            }else{
                ans.add(intervals[i]);
                i++;
            }
           
        }
        int[][] twoDArray = new int[ans.size()][];
        for ( i = 0; i < ans.size(); i++) {
            twoDArray[i] = ans.get(i);
        }
        return twoDArray;
    }
    public static void main(String[] args) {
        int intervals[][] = {{1,4},{2,3}};
        int ans[][]=merge(intervals);
        System.out.println();
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i][0]+","+ans[i][1]+" , ");
        }
    }
}
