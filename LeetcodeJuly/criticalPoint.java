

import java.util.ArrayList;

public class criticalPoint {
    public static class ListNode {
             int val;
             ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode prev=head;
        ListNode Next=head.next.next;
        ListNode curr=head.next;
        int index=2;
        while(Next!=null){
            if((prev.val<curr.val && Next.val<curr.val)||(prev.val<curr.val && Next.val<curr.val)){
                list.add(index);
            }
            index++;
                prev=curr;
                curr=Next;
                Next=Next.next;
        }
        int ans[]=new int[list.size()];
        int idx=0;
        for(int i:list)ans[idx++]=i;
        return ans;
     }
}
