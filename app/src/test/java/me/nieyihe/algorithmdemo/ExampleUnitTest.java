package me.nieyihe.algorithmdemo;

import org.junit.Test;

import java.util.Random;
import java.util.Set;

import me.nieyihe.algorithmdemo.array.Combination;
import me.nieyihe.algorithmdemo.array.Permutation;
import me.nieyihe.algorithmdemo.sort.BubbleSort;
import me.nieyihe.algorithmdemo.sort.FasterSorter;
import me.nieyihe.algorithmdemo.sort.HeapSorter;
import me.nieyihe.algorithmdemo.sort.InsertSort;
import me.nieyihe.algorithmdemo.sort.MergeSorter;
import me.nieyihe.algorithmdemo.utils.ArrayUtils;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private final int LARGE_DATA_LENGTH = 100;

    @Test
    public void algorithmMergeSortTest() throws Exception {
        int[] largeArray = new int[LARGE_DATA_LENGTH];
        Random random = new Random();
        for (int i = 0; i < LARGE_DATA_LENGTH; i++) {
            largeArray[i] = random.nextInt(LARGE_DATA_LENGTH);
        }
        long startTime = System.currentTimeMillis();
        new MergeSorter().sort(largeArray);
        long endTime = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        System.out.println();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }
    @Test
    public void algorithmMergeSortNonRecursiveTest() throws Exception {
        int[] largeArray = new int[LARGE_DATA_LENGTH];
        Random random = new Random();
        for (int i = 0; i < LARGE_DATA_LENGTH; i++) {
            largeArray[i] = random.nextInt(LARGE_DATA_LENGTH);
        }
        long startTime = System.currentTimeMillis();
        new MergeSorter().sortNonRecursive(largeArray);
        long endTime = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        System.out.println();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }

    @Test
    public void algorithmFasterSortTest() throws Exception {
        int[] largeArray = new int[LARGE_DATA_LENGTH];
        Random random = new Random();
        for (int i = 0; i < LARGE_DATA_LENGTH; i++) {
            largeArray[i] = random.nextInt(LARGE_DATA_LENGTH);
        }
        long startTime = System.currentTimeMillis();
        new FasterSorter().sort(largeArray);
        long endTime = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        System.out.println();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }

    @Test
    public void algorithmFasterSortNonRecursiveTest() throws Exception {
        int[] largeArray = new int[LARGE_DATA_LENGTH];
        Random random = new Random();
        for (int i = 0; i < LARGE_DATA_LENGTH; i++) {
            largeArray[i] = random.nextInt(LARGE_DATA_LENGTH);
        }
        long startTime = System.currentTimeMillis();
        new FasterSorter().sortNonRecursive(largeArray);
        long endTime = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        System.out.println();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }

    @Test
    public void algorithmHeapSortTest() throws Exception {
        int[] largeArray = new int[LARGE_DATA_LENGTH];
        Random random = new Random();
        for (int i = 0; i < LARGE_DATA_LENGTH; i++) {
            largeArray[i] = random.nextInt(LARGE_DATA_LENGTH);
        }
        long startTime = System.currentTimeMillis();
        new HeapSorter().sort(largeArray);
        long endTime = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        System.out.println();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }

    @Test
    public void algorithmBubbleSortTest() throws Exception {
        int[] largeArray = new int[LARGE_DATA_LENGTH];
        Random random = new Random();
        for (int i = 0; i < LARGE_DATA_LENGTH; i++) {
            largeArray[i] = random.nextInt(LARGE_DATA_LENGTH);
        }
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        long startTime = System.currentTimeMillis();
        new BubbleSort().sort1(largeArray);
        long endTime = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        System.out.println();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }

    @Test
    public void algorithmInsertSortTest() throws Exception {
        int[] largeArray = new int[LARGE_DATA_LENGTH];
        Random random = new Random();
        for (int i = 0; i < LARGE_DATA_LENGTH; i++) {
            largeArray[i] = random.nextInt(LARGE_DATA_LENGTH);
        }
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        long startTime = System.currentTimeMillis();
        new InsertSort().sort(largeArray);
        long endTime = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + ",");
        }
        System.out.println();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }

    @Test
    public void algorithmBinarySearchTest() throws Exception {
        int[] largeArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        new FasterSorter().sort(largeArray);
        long startTime = System.currentTimeMillis();
        int pos = ArrayUtils.binarySearch(largeArray, 10);
        long endTime = System.currentTimeMillis();
        System.out.print("pos >> " + pos);
        System.out.print(" 用时 >> " + (endTime - startTime));
    }

    @Test
    public void algorithmPermutationTest() throws Exception {
        char[] largeArray = new char[]{'a','b','c'};
        long startTime = System.currentTimeMillis();
        Set<String> result = new Permutation().operate(largeArray);
        for (String s : result) {
            System.out.println(s);
        }
        long endTime = System.currentTimeMillis();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }

    @Test
    public void algorithmCombinationTest() throws Exception {
        char[] largeArray = new char[]{'a','b','c','d','e'};
        long startTime = System.currentTimeMillis();
        Set<String> result = new Combination().operate(largeArray);
        for (String s : result) {
            System.out.println(s);
        }
        long endTime = System.currentTimeMillis();
        System.out.print(" 用时 >> " + (endTime - startTime));
    }
}