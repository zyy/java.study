package com.yycoder.j2se.sort;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-10
 * Time: 上午8:44
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
    public static int[] BubbleSort(int[] a) {
        int[] array = a.clone();//将传递的数据参数a克隆对象，不改变原数组的值
        for (int i = 0; i < array.length - 1; i++) {   //总共进行length -1 趟排序
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = new int[]{85, 63, 25, 14, 69, 5, 644};
        a = BubbleSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
