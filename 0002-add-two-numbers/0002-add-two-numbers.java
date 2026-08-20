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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Add values of l1
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }

        // Add values of l2
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }

        // Reverse both lists
        Collections.reverse(list1);
        Collections.reverse(list2);

        // Add digit by digit
        int i = list1.size() - 1;
        int j = list2.size() - 1;
        int carry = 0;

        List<Integer> result = new ArrayList<>();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum += list1.get(i);
                i--;
            }

            if (j >= 0) {
                sum += list2.get(j);
                j--;
            }

            result.add(sum % 10);
            carry = sum / 10;
        }

        
        

        // Convert ArrayList<Integer> to ListNode
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int num : result) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }
}