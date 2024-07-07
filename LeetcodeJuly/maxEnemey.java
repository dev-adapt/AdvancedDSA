import java.util.Arrays;

public class maxEnemey {
    public static long maximumPoints(int[] enemy, int curr) {
        int point=0,n=enemy.length;
        boolean flag[]=new boolean[n];
        for(int i=0;i<n;i++)flag[i]=false;
        Arrays.sort(enemy);
        curr=curr-enemy[0];
        point++;
        for(int i=0;i<n;i++){
            if(!flag[i]&&curr>=enemy[i]){
                curr-=enemy[0];
                point++;
            }
            else if(!flag[i] &&point>=1){
                curr+=enemy[i];
                flag[i]=true;
            }
        }
        return point;
    }
    public static void main(String[] args) {
        int[]enemyEnergies = {3,2,2};
        int currentEnergy = 2;
        System.out.println(maximumPoints(enemyEnergies, currentEnergy));
    }
}
