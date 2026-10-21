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
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while(true)
        {
            ListNode Kth = find(groupPrev , k);
            if(Kth == null)
                break;

            ListNode groupNext = Kth.next;

            ListNode prev = groupNext ;
            ListNode curr = groupPrev.next ;

            for (int i = 0; i < k; i++) 
            {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = groupPrev.next;
            groupPrev.next = Kth;
            groupPrev = temp;
        }

        return dummy.next;
    }
    public ListNode find(ListNode head, int k){
        if(head==null)return null;
        while(k>0 && head!=null){
            head=head.next;
            k--;
        }
        return head;
    }

    // public ListNode reverse(ListNode head){
    //     if(head==null || head.next==null){
    //         return head;
    //     }
    //     ListNode newNode=reverse(head.next);
    //     ListNode front=head.next;
    //     front.next=head;
    //     head.next=null;
    //     return newNode;
    // }
}