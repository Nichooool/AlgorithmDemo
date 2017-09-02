package me.nieyihe.algorithmdemo;

import org.junit.Test;

import java.util.Random;

import me.nieyihe.algorithmdemo.sort.FasterSorter;
import me.nieyihe.algorithmdemo.sort.HeapSorter;
import me.nieyihe.algorithmdemo.sort.MergeSorter;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private final int LARGE_DATA_LENGTH = 1000000;

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
}