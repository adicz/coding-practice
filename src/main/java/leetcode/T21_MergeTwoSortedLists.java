package leetcode;

/**
 * @link: https://leetcode.com/problems/merge-two-sorted-lists/
 * @difficulty: EASY
 */
public class T21_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 != null) return list2;
        if (list2 == null && list1 != null) return list1;
        if (list1 == null && list2 == null) return null;

        ListNode resultHead = new ListNode();
        ListNode currentResultNode = resultHead;
        ListNode current1Node = list1;
        ListNode current2Node = list2;

        while (current1Node != null && current2Node != null) {
            if (current1Node.val < current2Node.val) {
                currentResultNode.next = current1Node;
                current1Node = current1Node.next;
            } else {
                currentResultNode.next = current2Node;
                current2Node = current2Node.next;
            }
            currentResultNode = currentResultNode.next;
        }
        currentResultNode.next = current1Node != null ? current1Node : current2Node;
        return resultHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
