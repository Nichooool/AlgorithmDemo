package me.nieyihe.algorithmdemo.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import me.nieyihe.algorithmdemo.utils.ArrayUtils;

/**
 * nichool on 2017/9/9 17:03
 * 813825509@qq.com
 */

public class Permutation extends Operater<Set<String>>{

    public Permutation() {
        mPossibilitySet = new LinkedHashSet<>();
    }

    @Override
    public Set<String> operate(char[] array) {
        if (array != null) {
            permutation(array, 0);
        }
        return mPossibilitySet;
    }

    /**
     * 排列
     * */
    private void permutation(char[] array, int pBeginIndex) {
        if (pBeginIndex == array.length) {
            mPossibilitySet.add(String.valueOf(array));
        } else {
            for (int i = pBeginIndex; i < array.length; ++ i) {
                ArrayUtils.swap(array, i, pBeginIndex);
                permutation(array, pBeginIndex + 1);
                ArrayUtils.swap(array, i, pBeginIndex);
            }
        }
    }
}
