package leetcode;

import java.util.Arrays;

public class daysWithoutMeeting {
    static int meetingDays(int days, int[][] meetings){
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]); 

        int availableDays = 0;
        int currentDay = 1;

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            // If the current day is before the start of the meeting, count those days
            if (currentDay < start) {
                availableDays += start - currentDay;
            }

            // Update current day to the end of this meeting
            currentDay = Math.max(currentDay, end + 1);
        }

        // Count remaining available days after the last meeting
        if (currentDay <= days) {
            availableDays += days - currentDay + 1;
        }

        return availableDays;
    }
   public static void main(String[] args) {
    int days=10;
    int meetings[][]={{5,7},{1,3},{9,10}};
     Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
     for(int i=0;i<meetings.length;i++){
        for(int j=0;j<meetings[0].length;j++){
            System.out.print(meetings[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println(meetingDays(days, meetings));
   } 
}
