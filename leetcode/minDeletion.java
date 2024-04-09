package leetcode;

public class minDeletion {
    static int deletion(int []arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0 && arr[i]==arr[i+1]){

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums ={1,1,2,2,3,3};//output=2
       System.out.println(deletion(nums));
      
    }
}
