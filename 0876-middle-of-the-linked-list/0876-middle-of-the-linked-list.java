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
    public ListNode middleNode(ListNode head) {
        // int count=0;
        // ListNode temp1=head;
        // while(temp1.next!=null){
        //     temp1=temp1.next;
        //     count++;
        // }
        // int mid=count%2==0?count/2:(count/2)+1;
        // ListNode temp2=head;
        // while(temp2.next!=null && mid>0){
        //     temp2=temp2.next;
        //     mid--;
        // }
        // return temp2;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}