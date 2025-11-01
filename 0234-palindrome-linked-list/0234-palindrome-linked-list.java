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
    public boolean check(Stack<ListNode> stack, ListNode head) {
        ListNode curr = head;
        while(!stack.isEmpty() && curr!=null) {
         ListNode top= stack.pop();
         if(curr.val!=top.val){
            return false;
         }
         curr=curr.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            stack.push(curr);
            curr=curr.next;
        }
        return check(stack, head);
    }
}