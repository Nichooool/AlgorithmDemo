package me.nieyihe.algorithmdemo.utils;

import java.util.Set;

/**
 * nichool on 2017/9/8 16:56
 * 813825509@qq.com
 */

public class ArrayUtils {

    public static int binarySearch(int[] array, int num) {
        if (array == null) {
            return ~0;
        }
        int i = 0, j = array.length - 1;
        int midPos, midValue;
        while (i <= j) {
            midPos = (i + j) >>> 1;
            midValue = array[midPos];
            if (num > midValue) {
                i = midPos + 1;
            } else if (num < midValue) {
                j = midPos - 1;
            } else {
                return midPos;
            }
        }
        return ~i;
    }

    public static void swap(char[] originArray, int pos1, int pos2) {
        if (originArray == null) {
            return;
        }
        int length = originArray.length;
        if (pos1 >= length || pos2 >= length) {
            return;
        }
        if (pos1 == pos2) {
            return;
        }
        char tmp = originArray[pos1];
        originArray[pos1] = originArray[pos2];
        originArray[pos2] = tmp;
    }
}
