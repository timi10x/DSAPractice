/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:
Input: head = [1], n = 1
Output: []
Example 3:
Input: head = [1,2], n = 1
Output: [1]

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 */

class ListNode(var `val`: Int) {
        var next: ListNode? = null
}
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var right = head
    var left = head

    repeat(n) {
        right = right?.next
    }

    if(right == null) return head?.next

    while(right?.next != null) {
        right = right?.next
        left = left?.next
    }

    left?.next = left?.next?.next

    return head
}