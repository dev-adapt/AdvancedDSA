package Year2025.leetcodeJune.GREEDY;

public class lemonadeChange {
     public boolean lemonadeChangeBills(int[] bills) {
        int change=0;
        for(int i:bills){
            if(i==5) change+=5;
            else{
                if(change>=i-5){
                    change-=i-5;
                }else return false;
            }
        }
        return true;
    }
}
