package com.ethan.learning.algorithm;

import java.util.Arrays;

/**
 * @ClassName FibonacciSequence
 * @Description 斐波那契数列
 * @Date 2021/6/25 0:54
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class FibonacciSequence {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(20)));
    }

    private static int[] fibonacci(int n) {
        assert n > 0;
        if (n == 1) {
            return new int[]{1};
        }
        if (n == 2) {
            return new int[]{1, 1};
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                result[i] = 1;
            } else {
                result[i] = result[i - 1] + result[i - 2];
            }

        }
        return result;
    }
}