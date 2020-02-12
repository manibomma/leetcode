/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList;
        ListNode temp = new ListNode(-1);
        int carry = 0;
        sumList = temp;
        while(l1 != null && l2 != null) {
            temp.val = (l1.val + l2.val + carry) % 10 ;
            carry = (l1.val + l2.val + carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null && l2 != null) {
                temp.next = new ListNode(-1);
                temp = temp.next;
            }
        }
        
        while (l1 != null) {
            temp.next = new ListNode(-1);
            temp = temp.next;
            temp.val = (l1.val + carry) % 10 ;
            carry = (l1.val + carry) / 10;
            l1 = l1.next;
        }
        
        while (l2 != null) {
            temp.next = new ListNode(-1);
            temp = temp.next;
            temp.val = (l2.val + carry) % 10 ;
            carry = (l2.val + carry) / 10;
            l2 = l2.next;
        }
        
        if (carry != 0) {
            temp.next = new ListNode(-1);
            temp = temp.next;
            temp.val = carry;
        }
        
        return sumList;
        
    }
}