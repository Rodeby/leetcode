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
    public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
		while(current != null && current.next != null) {
			
			if(current.val == current.next.val) {
				current.next = current.next.next;
			}
			else {
				current = current.next;	
			}
				
					
		}
		
		return head;	
    }
}
//recursive
	public static ListNode removeDupsRec(ListNode head) {
		
		if(head == null|| head.next == null)
			return head;
		while(head.next != null && head.val == head.next.val)
			head.next = head.next.next;
			head.next = removeDupsRec(head.next);
			return head;
	}
