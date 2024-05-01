package leetcode;
import java.util.*;
public class findIntegerAdded2 {
    static int integerAdd(int[]num1,int []num2){
       int n=num2.length;
       Arrays.sort(num2);
       int res=Integer.MAX_VALUE;
       for(int i=0;i<num1.length;i++){
        for(int j=i+1;j<num1.length;j++){
            int[]temp=new int[num1.length-2];
            int idx=0;
            for(int k=0;k<num1.length;k++){
                if(k!=i && k!=j)temp[idx++]=num1[k];
            }
            Arrays.sort(temp);
            Integer curr=null; //The Integer class wraps a value of the primitive type int in an object. An object of type Integer contains a single field whose type is int.

          //  this class provides several methods for converting an int to a String and a String to an int, as well as other constants and methods useful when dealing with an int.
            boolean valid=true;
            for(int k=0;k<n;k++){
                int x=num2[k]-temp[k];
                if(curr==null)curr=x;
                else if(curr!=x){
                    valid=false;
                    break;
                }
            }
            if(valid && (res>curr))res=curr;
        }

       } return res;
      
    }
    public static void main(String[] args) {
        int[]num1={7,9,1,4};
        int[]num2={0,8};
        System.out.println(integerAdd(num1, num2));
    }
}
