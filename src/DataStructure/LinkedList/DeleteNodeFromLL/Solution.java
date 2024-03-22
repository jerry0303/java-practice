package DataStructure.LinkedList;


 //* Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

        Node cur = node;
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }

    }
}
