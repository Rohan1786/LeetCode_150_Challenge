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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode curr1 = list1;
        // ListNode curr2= list2;
        // if(list1==null) return list2;
        // ListNode temp = new ListNode();

        // while(curr1.next!=null && curr2.next!=null){
        //     if(curr1.val<curr2.val){
        //         temp=curr1;
        //         temp=temp.next;
        //     }else{
        //         temp=curr2;
        //         temp=temp.next;
        //     }
        // }

      
        // return temp;


        ListNode h = new ListNode(100);
        ListNode t = h;;
        ListNode t1=list1;
        ListNode t2 = list2;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t.next=t1;
                t=t1;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t2==null){
            t.next=t1;
        }
       if(t1==null){
        t.next=t2;
       }
       return h.next;
    }
}