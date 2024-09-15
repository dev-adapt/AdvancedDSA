package leetcodeAugustAndSeptember;
public class missingMean{
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int ans[]=new int[n];
        int numerator=0;
        for (int i : rolls) {
            numerator+=i;
        }
        int len=rolls.length;
        int rhs=(len+n)*mean;
       if(rhs<numerator)return new int[0];
        rhs-=numerator;
        int least=rhs/n;
     //   System.out.println(least+" "+numerator+" "+rhs);
        if(least>6)return new int[0];
        for(int i=0;i<ans.length;i++){
            ans[i]=least;
            rhs-=least;
        }   System.out.println(least+" "+numerator+" "+rhs);
       
      // if(n>)return new int[0];
        if(rhs!=0){
            while(rhs!=0){
                for(int i=0;i<ans.length;i++){
                  if(rhs!=0) { ans[i]+=1;
                    if(ans[i]>6)return new int[0] ;
                    rhs-=1;
                }
                }
            }
        }
        return ans[n-1]==0? new int[0]:ans;
    }
    public static void main(String[] args) {
        int[]rolls={4,2,2,5,4,5,4,5,3,3,6,1,2,4,2,1,6,5,4,2,3,4,2,3,3,5,4,1,4,4,5,3,6,1,5,2,3,3,6,1,6,4,1,3};
        int n=53,mean=2;
        int ans[]=new int[n];
        ans=missingRolls(rolls, mean, n);
        for (int i : ans) {
            System.out.print(i+"");
        }
        System.out.println();
        System.out.println(3/5);
    }
}