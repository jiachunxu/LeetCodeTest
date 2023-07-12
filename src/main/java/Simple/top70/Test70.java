package com0070j;

import java.lang.reflect.InvocationTargetException;

/**
 * @author JCX
 *
 * 70. 爬楼梯
 * https://leetcode.cn/problems/climbing-stairs/
 */
public class Test70 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Solution> solutionClass = Solution.class;
//        System.out.println(solutionClass);
        Solution solution = solutionClass.newInstance();
//        System.out.println(solution.climbStairs(1));
//        System.out.println(1 / 2);
//        solution.climbStairs(2);
        long l = System.currentTimeMillis();
        System.out.println(solutionClass.getDeclaredMethod("climbStairs", int.class).invoke(solution, 45));
        long l1 = System.currentTimeMillis();
        System.out.println("耗时" + (l1 - l));
    }
}

class Solution {
    public int climbStairs(int n) {
//n 的范围 1到45
        //爬楼梯
//        for (int i = 1; i <= n / 2; i++) {
//
//            System.out.println(i);
//
//        }
        return method1(n);
    }


    public int method1(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        int i1 = 1;
        int i2 = 2;
        int i3 = 0;
        for (int i = 3; i <= n; i++) {
            i3 = i1 + i2;
            i1 = i2;
            i2 = i3;


        }
        return i3;
    }

    //递归
    public int method2(int n) {

        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else {

            return method2(n - 1) + method2(n - 2);
        }


    }


}