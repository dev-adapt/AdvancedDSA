package GreedyAlgoirthm;

public class largestPalindromicNumber {
    static String largestPalindrome(String nums){
        int freq[]=new int [10];
        int count=0;
        for(int i=0;i<nums.length();i++){
            int curr=nums.charAt(i);
            count++;
            freq[curr-48]++;
        }
        int i=0,j=count-1;
        StringBuilder str=new StringBuilder(nums.length());
        while(i<j){
            for(int idx=9;idx>=0;idx--){
                if(freq[idx]>0&&freq[idx]%2==0){
                   for(int currentCount=freq[idx];currentCount>=0;currentCount--)
                   { str.insert(i,idx);
                    str.insert(j,idx);
                    i++;
                    j--;
                   }
                }
            }
        }
       return str.toString();

    }
    public static void main(String[] args) {
        String num="313551";
        System.out.println(largestPalindrome(num));
    }
}
