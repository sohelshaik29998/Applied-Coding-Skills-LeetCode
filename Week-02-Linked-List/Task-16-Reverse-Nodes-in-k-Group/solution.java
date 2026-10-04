class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupTail = dummy;

        while (true) {
            ListNode kth = getKthNode(prevGroupTail, k);

            if (kth == null) {
                break;
            }

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode curr = prevGroupTail.next;

            while (curr != groupNext) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }

            ListNode oldGroupHead = prevGroupTail.next;
            prevGroupTail.next = kth;
            prevGroupTail = oldGroupHead;
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
