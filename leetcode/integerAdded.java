package leetcode;

public class integerAdded {
    static int integerAdd(int[]num1,int []num2){
        int count=0,len=num1.length;
        int sum1=0,sum2=0;
        for(int i=0;i<num1.length;i++){
            sum1+=num1[i];
            sum2+=num2[i];
            if(num1[i]==num2[i])count++;
        }
        if(count>0&&count==len-1)return 0;
        if(sum2>sum1){
            int added=(sum2-sum1)/(len);
            for(int i=0;i<len;i++){
                num1[i]+=added;
            }
            return added;
        }else{
            int subs=(sum1-sum2)/(len);
           
            for(int i=0;i<len;i++){
                num1[i]-=subs;
            }
            return -subs;
        }
        
    }
    public static void main(String[] args) {
        int[]num1={10};
        int[]num2={5};
        System.out.println(integerAdd(num1, num2));
    }
}
