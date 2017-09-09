package me.nieyihe.algorithmdemo.sort;

/**
 * nichool on 2017/9/8 17:08
 * 813825509@qq.com
 */

public class BubbleSort extends IntSorter {
    @Override
    public void sort(int[] originArray) {
        if (originArray == null) {
            return;
        }
        int temp;
        for (int i = originArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i ; j ++) {
                if (originArray[j] > originArray[j + 1]) {
                    temp = originArray[j];
                    originArray[j] = originArray[j + 1];
                    originArray[j + 1] = temp;
                }
            }
        }
    }

    public void sort1(int[] originArray) {
        if (originArray == null) {
            return;
        }
        int temp;
        for (int i = 0; i <= originArray.length - 1; i++) {
            for (int j = originArray.length - 1; j > i ; j --) {
                if (originArray[j] < originArray[j - 1]) {
                    temp = originArray[j];
                    originArray[j] = originArray[j - 1];
                    originArray[j - 1] = temp;
                }
            }
        }
    }
}
