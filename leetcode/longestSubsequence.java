package leetcode;
//not very right code because in edge cases it was not working as DP was involved
public class longestSubsequence {
    static int subsequence(String s,int k){
        int ans=0;
        int count=-1;
        for(int i=0;i<s.length()-1;i++){
            int I=(int)(s.charAt(i));
            int J=(int)(s.charAt(i+1));
            if(J-I<=k && J-I>=0){
                  if(count!=-1&&count==i-1){
                    ans++;
                    count=i;
                    System.out.println(i+"  "+count+"   "+ans);
                   
                }else if(count!=i-1){
                    ans+=2;
                    count=i;
                    System.out.println(i+"  "+count+"   "+ans);
                 
                }
             }
        }
        return ans==s.length()-1?ans+1:ans;
    }
    public static void main(String[] args) {
        String s="pvjcci";
        int k=4;
        System.out.println(subsequence(s,k));
    }
}
