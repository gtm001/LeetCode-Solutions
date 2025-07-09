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

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         int count = 0;
//         ListNode list = head;
//         while(list!=null){
//             count++;
//             list = list.next;
//         }
//         int mid = count/2;
//         list = head;
//         while(mid>0){
//             list = list.next;
//             mid--;
//         }
//         return list;
//     }
// }

// ------- Using Two Pointer -----------------
class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode rabit = head;
            ListNode turtle = head;
            while(rabit!=null && rabit.next!=null){
                rabit = rabit.next.next;
                turtle = turtle.next;
            }
            return turtle;
        }
    }
