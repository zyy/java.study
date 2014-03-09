package com.yycoder;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-9
 * Time: 下午4:02
 * To change this template use File | Settings | File Templates.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 2 + 2 * flag;
                flag++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
