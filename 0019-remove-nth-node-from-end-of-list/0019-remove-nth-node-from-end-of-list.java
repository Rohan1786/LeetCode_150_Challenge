/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int findSize(ListNode head){
        ListNode curr = head;
        int size=1;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = findSize(head);
      int make = size-n;
      int k =0;
      if(make-1 == 0) return head.next;
      ListNode curr = head;

      while(curr!=null && curr.next!=null){
      if(k==make-2){
     curr.next=curr.next.next;
      } else{
        curr=curr.next; 
      }
      k++;
      }
      return head;
    }
    
}