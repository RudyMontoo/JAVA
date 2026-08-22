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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        if(k==0)return head;
        ListNode p1=head;
        ListNode p2=head;
        while(k>0){
            p1=p1.next;
            k--;
        }
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
       
        // p2 is the new tail
        ListNode newHead = p2.next;

        // Break the list
        p2.next = null;

        // Connect old tail to old head
        p1.next = head;

        return newHead;
       
       
            }

}