package leetcode;

import java.util.HashSet;

public class wonderfulSubstring {
    static long substrins(String s){
        long ans=0;
        int len=s.length();
        HashSet<String>st=new HashSet<>();
        //checking whether the string is wonderful string or not
       if(len!=1){ int[]odd=new int[26];
        for(int k=0;k<s.length();k++){
          int now=(int)s.charAt(k);
          odd[now-97]+=1;
        }
        int check=0;
        for(int k=0;k<odd.length;k++){
            if(odd[k]%2!=0)check++;
        }
        if(check<=1)ans++;
            System.out.println(s);
        }
        //checking wonderful string for the for substrings
         for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                 String curr=s.substring(i,j);
              //  if(st.isEmpty()||!st.contains(curr)){
                    int[]odds=new int[26];
                    for(int k=0;k<curr.length();k++){
                      int now=(int)curr.charAt(k);
                      odds[now-97]+=1;
                    }
                    int count=0;
                    for(int k=0;k<odds.length;k++){
                        if(odds[k]%2!=0)count++;
                    }
                    if(count>1)break;
                    else{ 
                        st.add(curr);
                        System.out.println(curr);
                        ans++;
                    }
             //   }
            }
         }   
        return ans;
    }
    public static void main(String[] args) {
        String s="ehaehcjjaafjdceac";
        System.out.println(substrins(s));
    //    int now=(int)s.charAt(0);
    //    System.out.println(now);
    }
}
