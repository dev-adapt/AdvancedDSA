package leetcode;

public class removeNodes {
      public class ListNode {
              int val;
              ListNode next;
              ListNode() {}
              ListNode(int val) { this.val = val; }
              ListNode(int val, ListNode next) { this.val = val; this.next = next; }
          }
          static  ListNode removeNode(ListNode head) {
            if (head == null) return null;
            head.next = removeNode(head.next);
            return head.next != null && head.val < head.next.val ? head.next : head;
          }
          public static void main(String[] args) {
        
    }
}
