import java.util.Arrays;

public class dividePlayerToEqualSkill {
    public static long dividePlayers(int[] skill) {
        int n=skill.length;
        if(n==2)return (long)skill[0]*skill[1];
        Arrays.sort(skill);
        int idx=n-1;
        int check=skill[0]+skill[n-1];
        long sum=skill[0]*skill[n-1];
        for(int i=1;i<n/2;i++){
            idx--;
            int curr=skill[i]+skill[idx];
            if(curr!=check) return(long)-1; 
            else
                sum+=skill[i]*skill[idx];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]skill={1,2,3,3,4,5};
        System.out.println(dividePlayers(skill));
    }
}
