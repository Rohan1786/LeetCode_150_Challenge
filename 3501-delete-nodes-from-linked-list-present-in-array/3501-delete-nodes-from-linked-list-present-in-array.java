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
    public ListNode modifiedList(int[] nums, ListNode head) {
         ListNode demo = new ListNode(-1);
         ListNode newCurr=demo;
         List<Integer> list = new ArrayList<>();
         Set<Integer> set = new LinkedHashSet<>();
         for(int num: nums){
            set.add(num);
         }
         ListNode curr = head;
         while(curr!=null){
            if(!set.contains(curr.val)) {
                newCurr.next=curr;
                newCurr=curr;
            }
            curr=curr.next;
         }
         newCurr.next=null;
         return demo.next;
    }
}