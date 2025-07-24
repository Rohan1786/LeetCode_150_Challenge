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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);
        ListNode tempE=even;
        ListNode tempO=odd;
       
        while(curr!=null){
           tempO.next=curr;
           curr=curr.next;
           tempO=tempO.next;

           tempE.next=curr;
           if(curr==null) break;
           curr=curr.next;
           tempE=tempE.next;
        }
        even=even.next;
        odd=odd.next;
        tempO.next=even;
   
        return odd;
    } 
}