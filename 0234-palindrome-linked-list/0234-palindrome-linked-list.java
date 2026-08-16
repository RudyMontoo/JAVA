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
        // step1 find mid 
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode firstHalf=head;
        ListNode secHalf=reverse(slow);
        while(secHalf!=null){
              if (firstHalf.val != secHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secHalf = secHalf.next;
        }

        return true;
    }


    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;

        ListNode newNode=reverse(head.next);
        ListNode front=head.next;

        front.next=head;
        head.next=null;
        return newNode;
    }
}