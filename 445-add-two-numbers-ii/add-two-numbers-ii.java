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
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        int carry = 0;
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }

        int i = list1.size() - 1; 
        int j = list2.size() - 1; 
        while (i >= 0 && j >= 0) {
            sum = list1.get(i) + list2.get(j) + carry;
            carry = sum / 10;
            if (sum > 9) {
                ans.add(sum % 10);
                i--;
                j--;
            } else {
                ans.add(sum);
                i--;
                j--;
            }
        }

            if (i >= 0) {
                while (i >= 0) {
                    sum = carry + list1.get(i);
                    carry = sum / 10;
                    if (sum > 9) {
                        ans.add(sum % 10);
                        i--;
                    } else {
                        ans.add(sum);
                        i--;
                    }
                }
            }

            if (j >= 0) {
                while (j >= 0) {
                    sum = carry + list2.get(j);
                    carry = sum / 10;
                    if (sum > 9) {
                        ans.add(sum % 10);
                        j--;
                    } else {
                        ans.add(sum);
                        j--;
                    }
                }
            }

            if (carry != 0) {
                ans.add(carry);
            }

        Collections.reverse(ans);

        ListNode dummy = new ListNode(ans.get(0));
        ListNode current = dummy;
        for (i = 1; i < ans.size(); i++) {
            ListNode newNode = new ListNode(ans.get(i));
            current.next = newNode;
            current = current.next;

        }
        return dummy;
    }
}