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
   public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }

    ArrayList<ListNode> list = new ArrayList<>();

    ListNode temp = head;

    while (temp != null) {
        list.add(temp);
        temp = temp.next;
    }

    Collections.sort(list, (a, b) -> Integer.compare(a.val, b.val));

    for (int i = 0; i < list.size() - 1; i++) {
        list.get(i).next = list.get(i + 1);
    }

    list.get(list.size() - 1).next = null;

    return list.get(0);
}
}



// class Solution{
//     public ListNode sortList(ListNode head) {

//     }

// }