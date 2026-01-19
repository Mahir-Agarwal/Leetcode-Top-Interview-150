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
        
        if( head ==null || left==right) return head;
        ListNode dummy =  new ListNode(0);
        dummy.next =head;
        ListNode p = dummy ;
        int j = 1 ;
        while(j < left){
            p = p.next;
            j++;
        }
        ListNode prev = p.next;
        ListNode curr= prev;
        ListNode res = null;

        for(int i = 0 ;  i<=right-left; i++){
            ListNode temp = curr.next;
            curr.next = res ;
            res = curr ;
            curr = temp ;
        }
        p.next = res;
        prev.next = curr;

        return dummy.next;




    }

    
}

//T.C -> O(N) where n is the number of nodes in the linked list
//S.C -> O(1) constant space