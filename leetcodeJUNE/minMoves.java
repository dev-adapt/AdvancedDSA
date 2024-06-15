package leetcodeJUNE;

import java.util.Arrays;

//2037
public class minMoves {
    static int minMovesToSeat(int[] seats, int[] students) {
        int ans=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
            if(seats[i]!=students[i])ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]seats = {3,1,5}, students = {2,7,4};
        System.out.println(minMovesToSeat(seats, students));
    }
}
