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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         ListNode dummy = new ListNode(0); // created dummy node for the case if we have left node as the first one!
         dummy.next = head;
         ListNode leftpre = dummy;
         ListNode currNode = head;
         for(int i=0;i<left-1;i++){
            leftpre = leftpre.next;
            currNode = currNode.next; // swapping starts from here
         }
         ListNode sublistHead = currNode;  // to use it later
         ListNode preNode = null; 
         for(int i=0;i<=right-left;i++){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            //swap
            preNode = currNode;
            currNode = nextNode;
         }
         // connecting the remaining nodes in proper order
         leftpre.next = preNode; 
         sublistHead.next = currNode;
        return dummy.next;
    }
}