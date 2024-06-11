package leetcodeJUNE;
//1122
public class relativeSortArray {
    static int[] relativeSort(int[] arr1, int[] arr2) {
        int arr[]=new int[1010];
        for(int i:arr1){
          arr[i]++;
        }
        int idx=0;
        for(int i:arr2){
            for(int j=0;j<arr[i];j++){
                arr1[idx++]=i;
            }
            arr[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                for(int j=0;j<arr[i];j++){
                arr1[idx++]=i;
            }
            }
        }
       
        return arr1;
    }
    public static void main(String[] args) {
       int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        relativeSort(arr1, arr2);
        for(int i:arr1)System.out.print(i+" ");
    }
}
