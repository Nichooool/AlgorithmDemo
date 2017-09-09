package me.nieyihe.algorithmdemo.array;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * nichool on 2017/9/9 17:00
 * 813825509@qq.com
 */

public abstract class Operater<T> {

    protected Set<String> mPossibilitySet;

    abstract public T operate(char[] array);
}
