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
        

        // l1 = reverse(l1); 
        // l2 =reverse(l2); 

        
        int res =0 ;
        int carry =0 ;
        ListNode dummy  = new ListNode(0);
        ListNode curr = dummy;

        while(l1!=null ||  l2!=null || carry !=0){
            int sum = carry ;

            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum%10);
            carry = sum/10;
            curr = curr.next;
        }
        
       

        return dummy.next;
    }

    public ListNode reverse(ListNode node){
        ListNode prev= null ;
        ListNode curr= node ;
        while(curr!=null){
            ListNode temp = curr.next ;
            curr.next =  prev;
            prev = curr;
            curr = temp ;
        }

        return prev;

    }
}

// T.C-> O(max(m,n)) where m and n are the lengths of the two linked lists
// S.C-> O(max(m,n)) for the new linked list