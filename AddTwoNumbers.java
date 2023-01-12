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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // sum of vals of one
        int sum1 = 0;

        // sum of vals of two
        int sum2 = 0;

        //iterate through l1 and then add the numbers based off base ten

        int multiplier = 1;

        while(l1.next != null) {

            sum1 += l1.val * multiplier;
            l1 = l1.next;
            multiplier *= 10;

        }
        
        
        multiplier = 1;

        while(l2.next != null) {

            sum2 += l2.val * multiplier;
            l2 = l2.next;
            multiplier *= 10;

        }

        int result = sum1 + sum2;

        ListNode head = new ListNode(0);

        ListNode l3 = head;

        int lastDigit = 0;

        while(result > 0) {

            lastDigit = result % 10;

            ListNode nextNode = new ListNode(lastDigit);

            l3.next = nextNode;

            l3 = l3.next;

            result /= 10;

        }

        return head.next;
        
    }

    public static void main(String args[]) {

        

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
