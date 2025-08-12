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
//     public ListNode reverseKGroup(ListNode head, int k) {
//         if(k <= 1 || head == null) {
//             return head;
//         }

//         ListNode current = head;
//         ListNode prev = null;

//         while (true) {
//         // check if k nodes remain 
//         ListNode check = current;
//         int count = 0;
//         while (check != null && count < k) {
//             check = check.next;
//             count++;
//         }

//         if (count < k) {
//             break; // not enough node to reverse
//         }

//         ListNode last = prev;
//         ListNode NewEnd = current;

//         // reverse between left to right
//         ListNode next = current.next;
//         for (int i = 0; current != null && i < k; i++) {
//             current.next = prev;
//             prev = current;
//             current = next;
//             if(next != null) {
//                 next = next.next;
//             }
//         }
//         if (last != null) {
//             last.next = prev;
//         } else {
//             head = prev;
//         }
//         NewEnd.next = current;

//         if (current == null) {
//             break;
//         }

//         prev = NewEnd;
//         }
//         return head;
//     }

// }

























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
       ListNode prevHead=new ListNode(0);
       ListNode prevdummy=prevHead;
       ListNode rev=head;
       ListNode dummy=new ListNode(0);
       ListNode temp=head;
       int flag=0;
       while(flag==0){
       for(int i=1;i<=k;i++)
       {
        if(temp==null)
        {
            flag=1;
            break;
        }
       
        temp=temp.next;


       }
       if(flag==0)
       {
        ListNode revHead=reverse(rev,k);
        
        prevdummy.next=revHead;
        rev.next=temp;
        prevdummy=rev;
      
        rev=temp;
       }
       }
       if(temp!=null){
       prevdummy.next=temp;
       }



        return prevHead.next;
    }
    private ListNode reverse(ListNode temp,int k)
    {    ListNode prev=null;
            
        for(int i=1;i<=k;i++)
        {
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
       return prev;
    }
}