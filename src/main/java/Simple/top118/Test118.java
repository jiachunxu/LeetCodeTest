package Simple.top118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adminjia
 * <p>
 * 118. 杨辉三角
 * <p>
 * https://leetcode.cn/problems/pascals-triangle/
 */
public class Test118 {
    public static void main(String[] args) {

        System.out.println(new Solution().generate(5));
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> l;
        for (int i = 1; i <= numRows; i++) {
            l = new ArrayList<>();
            if (i == 1) {
                l.add(1);
                lists.add(l);
                continue;
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    l.add(1);
                    continue;
                }
                List<Integer> d = lists.get(i - 2);
                int integer = d.get(j - 1);
                int integer1 = d.get(j - 2);
                int c = integer + integer1;
                l.add(c);

            }
            lists.add(l);

        }
        return lists;
    }


}