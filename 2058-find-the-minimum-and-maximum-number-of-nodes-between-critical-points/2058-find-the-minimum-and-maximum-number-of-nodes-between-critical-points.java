class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null) return new int[]{-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;
        int idx = 1;

        int firstIdx = -1;   // index of first critical point
        int lastIdx = -1;    // index of most recent critical point
        int minDist = Integer.MAX_VALUE;

        while (curr != null && curr.next != null) {
            boolean isMax = prev.val < curr.val && curr.val > curr.next.val;
            boolean isMin = prev.val > curr.val && curr.val < curr.next.val;

            if (isMax || isMin) {
                if (firstIdx == -1) {
                    firstIdx = idx;
                } else {
                    minDist = Math.min(minDist, idx - lastIdx);
                }
                lastIdx = idx;
            }

            idx++;
            curr = curr.next;
            prev = prev.next;
        }

        if (firstIdx == -1 || firstIdx == lastIdx) return new int[]{-1, -1};

        int maxDist = lastIdx - firstIdx; // last - first critical point is always the max gap
        return new int[]{minDist, maxDist};
    }
}