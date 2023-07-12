package Simple.top88;

import java.util.Arrays;

/**
 * @author adminjia
 */
public class Test88 {
    public static void main(String[] args) {

//        int[] num1 = {1, 2, 3, 0, 0, 0};
//        int[] num1 = {0};
        int[] num1 = {2, 0};

        int m = 1;
//        int[] num2 = {2, 5, 6};
        int[] num2 = {1};
        int n = 1;
        new Solution().merge1(num1, m, num2, n);


    }

}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) {
            System.arraycopy(nums2, 0, nums1, m + 0, n);
        }
        Arrays.sort(nums1);

    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int tail = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            System.out.println(Arrays.toString(nums1));
            return;
        }

        while (p1 >= 0 || p2 >= 0) {
            if (nums2[p2] >= nums1[p1]) {
                nums1[tail] = nums2[p2];
                tail--;
                p2--;


            } else {
                nums1[tail] = nums1[p1];
                tail--;


                p1--;

            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}