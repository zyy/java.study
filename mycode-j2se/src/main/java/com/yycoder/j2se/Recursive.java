package com.yycoder.j2se;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-10
 * Time: 上午8:29
 * To change this template use File | Settings | File Templates.
 */
public class Recursive {
    public static void main(String[] args) {
        System.out.println(Fib(6));
    }

    /**
     * 斐波那契数列
     * @param n
     * @return
     */
    public static long Fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n > 1) {
            return Fib(n - 1) + Fib(n - 2);
        }
        return 0;
    }
}
