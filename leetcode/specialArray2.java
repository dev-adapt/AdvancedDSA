package leetcode;
public class specialArray2 {
    static boolean[] isSpecialArray(int[] nums, int[][] queries){
        boolean[]ans=new boolean[queries.length];
        if(nums.length==1) {
           for(int i=0;i<queries.length;i++){ ans[i]=true;}
        return ans;
    }
        for(int i=0;i<queries.length;i++){
            int start=0,end=0;
            start=queries[i][0];
            end=queries[i][queries[0].length-1];
            if(start==end){
                ans[i]=true;
            }else{
            for(int j=start;j<end;j++){
                if((nums[j]%2==0 && nums[j+1]%2!=0)||(nums[j]%2!=0 && nums[j+1]%2==0)){
                    ans[i]=true;
                }else {
                    ans[i]=false;
                    break;
                }

            }
        }
    }
        return ans;
    }
    static void printing(boolean[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums []= {1};
        int queries[][]={{0,0},{0,0}};
       boolean[]ans= isSpecialArray(nums, queries);
        printing(ans);
    }
}
