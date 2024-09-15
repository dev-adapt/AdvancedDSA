package leetcodeAugustAndSeptember;

public class chalkReplacingStudent {
    public static int chalkReplacer(int[] chalk, int k) {
        int student=0;
        int num=0;
        for(int i:chalk)num+=i;
        int remaining=k%num;
        if(remaining==0)return student;
        for(int i=0;i<chalk.length;i++){
            if(remaining<chalk[i])return i;
            else remaining-=chalk[i];
        }
        return student;
    }
    public static void main(String[] args) {
        int chalk[]={5,1,5};
        int k=22;
        System.out.println(chalkReplacer(chalk, k));
    }
}
