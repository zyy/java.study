package com.yycoder.j2se.array;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-9
 * Time: 下午9:55
 *
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[4];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int j : b) {
            System.out.print(j + " ");
        }
    }
}
