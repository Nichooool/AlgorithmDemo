package me.nieyihe.algorithmdemo.sort;

import java.util.Stack;

/**
 * 作者：nichool on 2017/9/1 19:30
 * 邮箱：813825509@qq.com
 * 包名: me.nieyihe.algorithmdemo.sort
 */

public class MergeSorter extends IntSorter {

    @Override
    public void sort(int[] originArray) {
        if (originArray == null) {
            return ;
        }
        mergeSort(originArray, 0, originArray.length - 1);
    }

    @Override
    public void sortNonRecursive(int[] originArray) {
        if (originArray == null) {
            return;
        }
//        Stack<Integer> posStack = new Stack<>();
//        posStack.push(0);
//        posStack.push(originArray.length - 1);
//        int tmpStartPos = 0, tmpEndPos = originArray.length - 1;
//        while (true) {
//            int mid = (tmpEndPos + tmpStartPos) >>> 1;
//            posStack.push(mid + 1);
//            posStack.push(endPos);
//            posStack.push(startPos);
//            posStack.push(mid);
//        }
//        int endPos = posStack.pop();
//        int startPos = posStack.pop();
//
//        if (startPos >= endPos) {
//            continue;
//        }
//        mergeArray(originArray, startPos, mid, endPos);
    }

    private void mergeSort(int[] originArray, int startPos, int endPos) {
        if (startPos >= endPos) {
            return;
        }
        int mid = (endPos + startPos) >>> 1;
        mergeSort(originArray, startPos, mid);
        mergeSort(originArray, mid + 1, endPos);
        mergeArray(originArray, startPos, mid, endPos);
    }

    /**
     * 合并两个数组
     * */
    private void mergeArray(int[] originArray, int start, int mid, int end) {
        int leftArrayLength = mid - start + 1;
        int rightArrayLength = end - mid;
        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        for (int i = start, j = 0; i <= mid; i++, j ++) {
            leftArray[j] = originArray[i];
        }
        for (int i = mid + 1, j = 0; i <= end; i++, j ++) {
            rightArray[j] = originArray[i];
        }
        int originArrayPos = start;
        int leftArrayPos = 0, rightArrayPos = 0;
        try {
            while (originArrayPos <= end) {
                int leftValue = leftArray[leftArrayPos];
                int rightValue = rightArray[rightArrayPos];
                if (leftValue <= rightValue) {
                    originArray[originArrayPos] = leftValue;
                    leftArrayPos++;
                } else {
                    originArray[originArrayPos] = rightValue;
                    rightArrayPos++;
                }
                originArrayPos++;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            //使用Try Catch 可以减少索引是否越界的判断 从而减少while循环中的语句条数 提高效率
            int[] remaindArray;
            int tmpPos;
            if (leftArray.length > leftArrayPos) {
                remaindArray = leftArray;
                tmpPos = leftArrayPos;
            } else {
                remaindArray = rightArray;
                tmpPos = rightArrayPos;
            }
            while (originArrayPos <= end) {
                originArray[originArrayPos] = remaindArray[tmpPos];
                tmpPos ++;
                originArrayPos ++;
            }
        }
    }

}
