/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        int len=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode temp=slow;
                do{
                    temp=temp.next;
                    len++;
                }while(temp!=slow);
                break;

            }

        } 
        if(len==0)return null;

        ListNode s=head;
        ListNode f=head;
        while(len>0){
            s=s.next;
            len--;
        }

        while(s!=f){
            s=s.next;
            f=f.next;
        }

        return s;

    }
}