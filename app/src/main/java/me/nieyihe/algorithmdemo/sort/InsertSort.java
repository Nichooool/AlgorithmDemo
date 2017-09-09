package me.nieyihe.algorithmdemo.sort;

/**
 * nichool on 2017/9/8 17:35
 * 813825509@qq.com
 */

public class InsertSort extends IntSorter {

    @Override
    public void sort(int[] originArray) {
        if (originArray == null || originArray.length == 1) {
            return;
        }
        for (int i = 1; i < originArray.length; i ++ ) {
            int key = originArray[i];
            int j = i - 1;
            while (j >= 0 && originArray[j] > key) {
                originArray[j + 1] = originArray[j];
                j --;
            }
            originArray[j + 1] = key;
        }
    }
}
