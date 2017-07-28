package com.yycoder.j2se.search;

import com.yycoder.j2se.sort.BubbleSort;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-10
 * Time: 下午12:18
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {
    public static int binarySearch(int[] srcArray, int des) {
        int low = 0;
        int high = srcArray.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >>> 1);
            if (des == srcArray[middle]) {
                return middle;
            } else if (des < srcArray[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] agrs) {
        int[] src = new int[]{4, 67, 78, 1, 90, 5, 23, 45, 6, 88};
        src = BubbleSort.BubbleSort(src);
        for (int i : src) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print(binarySearch(src, 90));
    }
}
