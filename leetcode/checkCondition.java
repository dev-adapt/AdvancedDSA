package leetcode;
public class checkCondition {
    static boolean checkGrid(int[][]arr){
        int n=arr.length,m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              
                    if(i+1!=n && arr[i][j] != arr[i + 1][j])return false;
                    if (j+1!=m &&arr[i][j] == arr[i][j + 1]) return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
       int[][]arr= {{1,0,2},{1,0,2}};
       System.out.println(checkGrid(arr));
    }
}
