package com.ethan.learning.lottery;

import java.util.*;
import java.util.function.Function;

/**
 * @ClassName DoubleColourLotteryGenerator
 * @Description 福彩-双色球（前区“1-33选6位”＋后区“1-16选1位”）
 * @Date 2021/6/21 11:11
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class DoubleColourLotteryGenerator {

    public static void main(String[] args) {
        List<Integer> redNumbers = new ArrayList<>();
        for (int i = 1; i < 34; i++) {
            redNumbers.add(i);
        }
        Collections.shuffle(redNumbers);
        List<Integer> front = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Collections.shuffle(redNumbers);
            int index = (int) (Math.random() * redNumbers.size());
            front.add(redNumbers.get(index));
            redNumbers.remove(index);
        }

        List<Integer> blueNumbers = new ArrayList<>();
        for (int i = 1; i < 17; i++) {
            blueNumbers.add(i);
        }
        List<Integer> back = new ArrayList<>();
        Collections.shuffle(blueNumbers);
        int index = (int) (Math.random() * blueNumbers.size());
        back.add(blueNumbers.get(index));

        front.sort(Comparator.comparing(Function.identity()));

        Integer[] frontArray = front.toArray(new Integer[front.size()]);
        Integer[] backArray = back.toArray(new Integer[back.size()]);

        System.out.println(Arrays.toString(frontArray) + ", " + Arrays.toString(backArray));
    }
}