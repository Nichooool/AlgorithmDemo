package me.nieyihe.algorithmdemo.sort;

import java.util.Random;
import java.util.Stack;

/**
 * 作者：nichool on 2017/9/1 19:33
 * 邮箱：813825509@qq.com
 */

public class FasterSorter extends IntSorter {
    //保存成对象 减少对象创建次数 减少gc可能性
    private Random mRandom = new Random();

    @Override
    public void sort(int[] originArray) {
        if (originArray == null) {
            return;
        }
        fasterSort(originArray, 0, originArray.length - 1);
    }

    @Override
    public void sortNonRecursive(int[] originArray) {
        if (originArray == null) {
            return;
        }
        Stack<Integer> posStack = new Stack<>();
        posStack.push(0);
        posStack.push(originArray.length - 1);

        while (!posStack.isEmpty()) {
            int endPos = posStack.pop();
            int startPos = posStack.pop();
            if (startPos >= endPos) {
                continue;
            }
            int partitionPointPos = randomPartition(originArray, startPos, endPos);
            posStack.push(partitionPointPos + 1);
            posStack.push(endPos);
            posStack.push(startPos);
            posStack.push(partitionPointPos);
        }
        //释放内存
        posStack.clear();
    }

    private void fasterSort(int[] originArray, int start, int end) {
        if (start >= end) {
            return;
        }
        int partitionPointPos = randomPartition(originArray, start, end);
        fasterSort(originArray, start, partitionPointPos);
        fasterSort(originArray, partitionPointPos + 1, end);
    }

    /**
     * 分割数组 - 加入随机性, 降低快速排序的最差时间的可能性 <br/>
     * 尤其是原本有序数据时 如果不随机将会是n^2时间复杂度
     * */
    private int randomPartition(int[] originArray, int start, int end) {
        int randomPos = start + mRandom.nextInt(end - start);
        int kPos = end;
        //将随机位置的数据换到k位置
        swap(originArray, kPos, randomPos);
        int kValue = originArray[kPos];
        //将小的数据放左边 大的数据放右边
        int i = start - 1, j = start;
        while (j < end) {
            if (originArray[j] < kValue) {
                i ++;
                swap(originArray, i, j);
            }
            j ++;
        }
        swap(originArray, i + 1, kPos);
        return i + 1;
    }
}
