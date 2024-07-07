package GreedyAlgoirthm;

import java.util.ArrayList;
import java.util.Comparator;

public class maxMeetingsInOneRoom {
    private static class Meeting{
        Integer start,end;
        public String toString(){
            return start+" "+end;
        }
    }
    public static int maxEvents(int[][] events) {
        ArrayList<Meeting>meetings=new ArrayList<>();
        for(int i=0;i<events.length;i++){
            Meeting meeting=new Meeting();
            meeting.start=events[i][0];
            meeting.end=events[i][1];
            meetings.add(meeting);
        }

        meetings.sort(new compareMeeting());
        System.out.println(meetings);
        int ans=1;
        Meeting prev=meetings.get(0);
        for(int i=1;i<meetings.size();i++){
            Meeting curr=meetings.get(i);
            if((curr.start>=prev.end&& ans<curr.end)||(curr.start==curr.end && ans<curr.end)){
                ans++;
                prev=curr;
            }else if(curr.start==prev.start &&curr.end==prev.end){
                if(ans>=curr.start&&ans<curr.end){
                    ans++;
                    prev=curr;
                }
            }
            else if(curr.start<prev.end){
                if(ans<curr.end){
                    ans++;
                    prev=curr;
                }
             }
        }
        return ans;
    }
   
    private static class compareMeeting implements Comparator<Meeting>{
        public int compare(Meeting m1,Meeting m2){
            if(m1.end>m2.end)return 1;
            else if(m1.end<m2.end)return -1;
            else{
                if(m1.start>m2.start)return 1;
                else if(m2.start>m1.start)return -1;
            }
            return 0;
        }
    }
    public static void main(String[] args) {
       int [][] events = {{1,10},{2,2},{2,2},{2,2},{2,2}};
      // System.out.println(0%1);
       System.out.println(maxEvents(events));
    }
}
