package com.ethan.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName NarcissisticNumber
 * @Description 水仙花数
 * @Date 2021/6/25 0:37
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int a, b, c, i = 100; i <= 999; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                list.add(i);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}