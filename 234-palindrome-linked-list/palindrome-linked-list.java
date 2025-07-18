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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prvHead = head;
        ListNode sMid = revL(slow);
        while(sMid!=null){
            if(sMid.val!=prvHead.val){
                return false;
            }
            sMid = sMid.next;
            prvHead = prvHead.next;
        }
        return true;
    }
    public static ListNode revL(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode = revL(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}