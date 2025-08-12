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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode prevHead = new ListNode(0);
       ListNode prevGroupTail = prevHead;
       ListNode groupHead = head;
       ListNode nextGroupHead = head;
       int flag = 0;
       while(flag == 0){
       for(int i = 1; i <= k; i++)
       {
        if(nextGroupHead == null)
        {
            flag = 1;
            break;
        }
        nextGroupHead = nextGroupHead.next;
       }
       if(flag == 0)
       {
        ListNode revHead = reverse(groupHead,k);
        
        prevGroupTail.next = revHead;
        groupHead.next = nextGroupHead;
        prevGroupTail = groupHead;
      
        groupHead = nextGroupHead;
       }
       }
       if(nextGroupHead != null){
       prevGroupTail.next = nextGroupHead;
       }
        return prevHead.next;
    }
    private ListNode reverse(ListNode temp,int k)
    {    ListNode prev = null;
            
        for(int i = 1; i <= k; i++)
        {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
       return prev;
    }
}