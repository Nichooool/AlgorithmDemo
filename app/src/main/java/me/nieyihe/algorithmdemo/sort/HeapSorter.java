package me.nieyihe.algorithmdemo.sort;

import java.util.PriorityQueue;

/**
 * 作者：nichool on 2017/9/1 20:45
 * 邮箱：813825509@qq.com
 */

public class HeapSorter extends IntSorter {
    private PriorityQueue<Integer> priorityQueue;

    @Override
    public void sort(int[] originArray) {
        priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < originArray.length; i++) {
            priorityQueue.offer(originArray[i]);
        }

        for (int i = 0; i < originArray.length; i++) {
            originArray[i] = priorityQueue.poll();
        }
    }
}
