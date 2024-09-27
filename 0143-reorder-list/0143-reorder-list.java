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
    public void reorderList(ListNode head) {
         if(head==null || head.next==null){
            return;
        }
        ListNode mid = getMiddle(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;
        while(hs!=null && hf!=null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf!=null){
            hf.next=null;
        }
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