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
// class Solution {
//     private int functionToDecimal(StringBuilder str){
//         int n = str.length();
//         if(n==0) return 0;
//         if(n==1) return str.charAt(n-1)=='1'?1:0;
//         int value =0;
//         int sum=0;
//         for(int i=0;i<n;i++){
//             char ch = str.charAt(i);
//             value=Character.getNumericValue(ch);
//             int mul=(int)Math.pow(2,value);
//            sum+=mul;

//         }
//         return sum;
//     }
//     public int getDecimalValue(ListNode head) {
//         ListNode current = head;
//        StringBuilder str=new StringBuilder();
//        while(current!=null)
//        {
//         str.append(current.val);
//         current = current.next;
//        }
//        str= str.reverse();
//        return functionToDecimal(str);
//     }
// }
  class Solution{
  public int getDecimalValue(ListNode head) {
    ListNode current = head;
    int result=0;
    while(current!=null){
        result=(result<<1) | current.val;

        current = current.next;
    }
    return result;
  }}