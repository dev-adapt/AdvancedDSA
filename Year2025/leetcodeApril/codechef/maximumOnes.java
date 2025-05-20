package Year2025.leetcodeApril.codechef;

import java.util.Scanner;

public class maximumOnes {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            
            char[]arr=s.toCharArray();
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]=='0'){
                    arr[j]='1';
                    count++;}
            }
           if(count<=k && count!=n){
            System.out.println(n);
           }else if(count>k && count!=n){
            System.out.println(n-count+k);
           }
        }
	}
}
