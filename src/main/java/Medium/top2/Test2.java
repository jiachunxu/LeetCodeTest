package Medium.top2;

/**
 * @author adminjia
 *
 *
 * https://leetcode.cn/problems/add-two-numbers/solution/liang-shu-xiang-jia-by-leetcode-solution/
 */
public class Test2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));


        new Solution().addTwoNumbers(l1, l2);
    }

}


class ListNode {
    int val;
    ListNode next;


    ListNode() {
    }


    ListNode(int val) {
        this.val = val;
    }


    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return m2(l1, l2);
    }


    //
    public ListNode m2(ListNode l1, ListNode l2) {

        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    // 溢出
    public ListNode m1(ListNode l1, ListNode l2) {

        long num1 = 0;
        long num2 = 0;
        int t1 = 0;
        int t2 = 0;
        while (l1 != null) {

            num1 = num1 + (long) Math.pow(10, t1) * l1.val;
            l1 = l1.next;
            t1++;
        }
        while (l2 != null) {

            num2 = num2 + (long) Math.pow(10, t2) * l2.val;
            l2 = l2.next;
            t2++;
        }
        Long temp = (long) num1 + (long) num2;
        String str = temp + "";

        ListNode node = new ListNode();
        ListNode node1 = node;
        ListNode tem = new ListNode();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            node.val = Integer.parseInt(c + "");
            if (i == 0) {
                break;
            }
            node.next = new ListNode();
            node = node.next;

        }


        return node1;
    }

}