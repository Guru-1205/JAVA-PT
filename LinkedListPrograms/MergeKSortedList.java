package Interview_Questions.LinkedListPrograms;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i += interval * 2) {
                lists[i] = merge2Lists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }

        return lists[0];
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null)
            curr.next = l1;
        if (l2 != null)
            curr.next = l2;

        return dummy.next;
    }

    public static void main(String[] args) {
        MergeKSortedList solution = new MergeKSortedList();

        // Example usage:
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode l4 = new ListNode(2);
        l4.next = new ListNode(6);

        ListNode result = solution.mergeKLists(new ListNode[] { l1, l2, l3, l4 });

        // Print the merged list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
