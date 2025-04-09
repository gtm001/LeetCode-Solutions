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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N = 0;
        ListNode curr = head;

        // finding total length of LinkedList
        while(curr!=null){
            N++;
            curr = curr.next;
        } 
        // Checking edge cases
        if(n<0 || n>N){
            return null;
        }
        // removing head condition
        if(n==N){
            return head.next;
        }
        int target=N-n;
        int i = 1;
        ListNode newCurr = head;
        while(i<target){
            newCurr=newCurr.next;
            i++;
        }
        newCurr.next = newCurr.next.next; 
        return head;
    }
}