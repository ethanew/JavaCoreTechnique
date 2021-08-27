package com.ethan.learning.lottery;

import java.util.*;
import java.util.function.Function;

/**
 * @ClassName SevenHappyLotteryGenerator
 * @Description 福彩-七乐彩（前区“1-30选7位”＋后区“1-30选1位，8位数字不重复”）
 * @Date 2021/6/17 17:27
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class SevenHappyLotteryGenerator {

    public static void main(String[] args) {
        List<Integer> redNumbers = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            redNumbers.add(i);
        }
        Collections.shuffle(redNumbers);
        List<Integer> front = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Collections.shuffle(redNumbers);
            int index = (int) (Math.random() * redNumbers.size());
            front.add(redNumbers.get(index));
            redNumbers.remove(index);
        }

        List<Integer> back = new ArrayList<>();
        Collections.shuffle(redNumbers);
        int index = (int) (Math.random() * redNumbers.size());
        back.add(redNumbers.get(index));

        front.sort(Comparator.comparing(Function.identity()));

        Integer[] frontArray = front.toArray(new Integer[front.size()]);
        Integer[] backArray = back.toArray(new Integer[back.size()]);

        System.out.println(Arrays.toString(frontArray) + ", " + Arrays.toString(backArray));
    }
}