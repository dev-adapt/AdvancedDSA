package leetcodeJUNE;

public class contestFOURoTWO {
    static int countCompleteDayPairs(int[] hours) {
        int n=hours.length,count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((hours[i]+hours[j])%24==0)count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]hours ={12,12,30,24,24};
        System.out.println(countCompleteDayPairs(hours));
    }
}
