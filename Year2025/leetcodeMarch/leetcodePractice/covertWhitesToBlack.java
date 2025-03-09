package leetcodePractice;

import java.util.Arrays;

public class covertWhitesToBlack {
    public static int minimumRecolors(String blocks, int k) {
        char[]charray=blocks.toCharArray();
       // int min=0;
        int min=convert(charray, 0, k-1);
        int curr=min;
        for(int i=k;i<charray.length;i++){
            if(charray[i]=='W'&&charray[i-k]=='B')curr++;
            else if(charray[i]=='B'&&charray[i-k]=='W')curr--;

            if(curr<min)min=curr;
        }
        return min;
    }
    public static int convert(char[]ch,int st,int end){
        int white=0;
        for(int i=st;i<=end;i++){
            if(ch[i]=='W')white++;
        }
        return white;
    }
    public static void main(String[] args) {
        String s="WBWBBBW";
        System.out.println(minimumRecolors(s, 3));
    }
}
