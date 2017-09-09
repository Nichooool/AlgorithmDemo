package me.nieyihe.algorithmdemo.array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * nichool on 2017/9/9 18:12
 * 813825509@qq.com
 */

public class Combination extends Operater<Set<String>> {

    public Combination() {
        mPossibilitySet = new LinkedHashSet<>();
    }

    @Override
    public Set<String> operate(char[] array) {
        if (array != null) {
            combination(array, 0);
        }
        return mPossibilitySet;
    }

    /**
     * 组合 <br/>
     * <p>
     * 分治思想: 分为第一个字母本身 和 第一个字母和（后面所有字母的组合）的组合
     * </p>
     * */
    private void combination(char[] array, int mBeginIndex) {
        if (mBeginIndex == array.length) {
            return;
        }
        String currentChar = String.valueOf(array[mBeginIndex]);
        //执行后面的组合
        combination(array, mBeginIndex + 1);
        //将当前字母与后面组合进行组合
        List<String> stringList = new ArrayList<>(mPossibilitySet.size());
        //获取当前的组合集合
        for (String s : mPossibilitySet) {
            stringList.add(s);
        }
        //拼接第一个字母
        for (String s : stringList) {
            mPossibilitySet.add(currentChar + s);
        }
        //当前字母本身
        mPossibilitySet.add(String.valueOf(array[mBeginIndex]));
    }
}
