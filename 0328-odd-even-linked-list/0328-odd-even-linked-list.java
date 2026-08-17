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
    public ListNode oddEvenList(ListNode head) {
        // METHOD 1 using collection framework
    //     if(head==null)return null;
    //     ListNode temp=head;
    //     LinkedList<ListNode> odd=new LinkedList<>();
    //      LinkedList<ListNode> even=new LinkedList<>();
    //     int x=1;
    //     while(temp!=null){
    //         if(x==1){
    //             odd.add(temp);
    //             x=0;
    //         }
    //         else{
    //             even.add(temp);
    //             x=1;
    //         }
    //         temp=temp.next;
    //     }

    //     odd.addAll(even);

    //       for (int i = 0; i < odd.size() - 1; i++) {
    //     odd.get(i).next = odd.get(i + 1);
    // }

   
    // odd.get(odd.size() - 1).next = null;

    // return odd.getFirst();


    // Method 2 OPTIMIZATION POINTER
        if(head==null)return null;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=head.next;

        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=even.next;
            even.next=even.next.next;
            even=odd.next;

        }
        odd.next=evenhead;
        return head;

    }
}