package Year2025.leetcodeJune.practice;

import java.util.*;


public class mapping {
     public static int minMaxDifference(int num) {
        int n=num,count=1;
        while(n>9){
            n/=10;
            count++;
        }
        n=num;
        
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<count;i++){
            ls.add(num%10);
            num/=10;
           
        }
        
        Collections.reverse(ls);
        System.out.println(ls);
        int max=0,min=0;
        int check=ls.get(0);
        
        for(int i=0;i<count;i++){
          int curr=ls.get(i);
          if(curr==check){
            max+=9;
            min+=0;
          }else{
            max+=curr;
            min+=curr;
          }
          if(i<count-1){
             max*=10;
           min*=10;
          }
        }
        System.out.println(min +" "+max);
        return max-min;
    }
    public static void main(String[] args) {
        int num=90;
        System.out.println(minMaxDifference(num));
    }
}
