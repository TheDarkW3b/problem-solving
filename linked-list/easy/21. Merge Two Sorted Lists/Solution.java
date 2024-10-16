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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode first = list1, second = list2,head2 = dummy;

        while(first != null && second != null){
            if(first.val <= second.val){
                ListNode newNode = new ListNode(first.val);
                dummy.next = newNode;
                dummy = dummy.next;
                first = first.next;
            } else {
                ListNode newNode = new ListNode(second.val);
                dummy.next = newNode;
                dummy = dummy.next;
                second = second.next;
            }
        }

        if(first == null)
            dummy.next = second;
        else
            dummy.next = first;

        return head2.next;
    }
}
