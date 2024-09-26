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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMiddle(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverse = headSecond;
        // compare both the halves
        while(head!=null && headSecond!=null){
            if(head.val!=headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverse);
        if(head==null || headSecond==null){
            return true;
        }
        return false;
    }
      static ListNode getMiddle(ListNode head){
       ListNode first = head;
       ListNode second = head;
       while(second!=null && second.next!=null){
           first = first.next;
           second = second.next.next;
       }
       return first;
    }
     static ListNode reverseList(ListNode head){
      
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next =next.next;
            }
        }
        head = prev;
        return head;
    }
}