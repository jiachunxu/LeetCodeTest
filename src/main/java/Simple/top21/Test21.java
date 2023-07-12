package Simple.top21;

/**
 * @author JCX
 * 时间: 2021/10/3 - 10 - 03 - 17:04
 * <p>
 * 简单: 21. 合并两个有序链表
 * https://leetcode.cn/problems/merge-two-sorted-lists/
 */
public class Test21 {
    public static void main(String[] args) {
/*
输入：l1 = [1,2,4], l2 = [1,3,4]
输出：[1,1,2,3,4,4]
 */
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();


        System.out.println(new Solution().mergeTwoLists(l1, l2));


    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //递归
//        if (list1 == null) {
//            return list2;
//        }
//        if (list2 == null) {
//            return list1;
//        }
//        if (list1.val < list2.val) {
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        } else {
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }

        //遍历
        ListNode listNode1 = new ListNode(-1);
        ListNode listNode = listNode1;


        while (true) {
            if (list1 == null) {
                listNode.next = list2;
                return listNode1.next;

            } else if (list2 == null) {
                listNode.next = list1;
                return listNode1.next;
            }
            if (list1.val < list2.val) {
                listNode.next = list1;
                list1 = list1.next;

            } else {
                listNode.next = list2;
                list2 = list2.next;
            }
            listNode = listNode.next;


        }


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
