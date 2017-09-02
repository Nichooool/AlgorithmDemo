package me.nieyihe.algorithmdemo.sort;

/**
 * 作者：nieyihe on 2017/9/1 19:30
 * 邮箱：813825509@qq.com
 * 包名: me.nieyihe.algorithmdemo.sort
 */

public abstract class IntSorter {
    abstract public void sort(int[] originArray);

    public void sortNonRecursive(int [] originArray) {}

    protected void swap(int[] originArray, int pos1, int pos2) {
        if (originArray == null) {
            return;
        }
        int length = originArray.length;
        if (pos1 >= length || pos2 >= length) {
            return;
        }
        int tmp = originArray[pos1];
        originArray[pos1] = originArray[pos2];
        originArray[pos2] = tmp;
    }
}
