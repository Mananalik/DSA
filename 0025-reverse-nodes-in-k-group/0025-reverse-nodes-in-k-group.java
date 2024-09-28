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
    public ListNode reverseKGroup(ListNode head, int k) {
         if(k<=1 || head==null){
            return head;
        }

            ListNode current = head;
            ListNode prev = null;
        ListNode temp = head;
         int count=0;
            while(temp!=null){
                temp = temp.next;
                count++;
            }
        int s=0;
        while(true){
            ListNode last = prev;
            ListNode newEnd = current;
            // reverse between left and right
            ListNode next = current.next;
            for(int i=0;current!=null && i<k;i++){
                if(count<k){
                    break;
                }
                current.next = prev;
                prev = current;
                current = next;
                if(next!=null){
                    next=next.next;
                }
                s++;
            }
            if(last!=null){
                last.next=prev;
            }else{
                head=prev;
            }
            newEnd.next=current;
            if(count-s<k){
                break;
            }
            prev = newEnd;
        }
        return head;
    }
}