package com.yycoder.j2se.array;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-11
 * Time: 上午8:43
 * To change this template use File | Settings | File Templates.
 */
public class ArraysExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("yycoder", "zyy");
        System.out.println(list.getClass());
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("--------------------------------");

        int[] intArray = new int[]{2, 4, 7, 9};
        int a = 2;
        int result = Arrays.binarySearch(intArray, a);
        System.out.println("The index of " + a + " is:" + result);
        result = Arrays.binarySearch(intArray, 1, 3, a);
        System.out.println("The index of " + a + " is:" + result);

        System.out.println("--------------------------------");

        int[] copyArray = Arrays.copyOf(intArray, 4);
        System.out.println(Arrays.toString(copyArray));
        //如果超出原数组的长度用0填充
        int[] copyArray1 = Arrays.copyOf(intArray, 6);
        System.out.println(Arrays.toString(copyArray1));

        System.out.println("--------------------------------");

        int[] copyArray2 = Arrays.copyOfRange(intArray, 2, 4);
        System.out.println(Arrays.toString(copyArray2));

        System.out.println("--------------------------------");

        System.out.println(Arrays.equals(intArray, copyArray));
        System.out.println(intArray.equals(copyArray));

        System.out.println("--------------------------------");

        Arrays.fill(copyArray, 3);
        System.out.println(Arrays.toString(copyArray));
        Arrays.fill(copyArray, 2, 4, 4);
        System.out.println(Arrays.toString(copyArray));

        System.out.println("--------------------------------");

        System.out.println(Arrays.hashCode(copyArray));
        System.out.println(Arrays.hashCode(copyArray));

        System.out.println("--------------------------------");

        int[] sortArray = new int[]{23, 5, 96, 24, 8};
        System.out.println(Arrays.toString(sortArray));
        Arrays.sort(sortArray, 2, 5);
        System.out.println(Arrays.toString(sortArray));
        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray));
    }
}
