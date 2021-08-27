package com.ethan.learning.lottery;

import java.util.*;
import java.util.function.Function;

/**
 * @ClassName SuperLotteryGenerator
 * @Description 体彩-超级大乐透（前区“35选5”＋后区“12选2”）
 * @Date 2021/6/17 17:27
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class SuperLotteryGenerator {

    public static void main(String[] args) {
        List<Integer> redNumbers = new ArrayList<>();
        for (int i = 1; i < 36; i++) {
            redNumbers.add(i);
        }
        Collections.shuffle(redNumbers);
        List<Integer> front = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(redNumbers);
            int index = (int) (Math.random() * redNumbers.size());
            front.add(redNumbers.get(index));
            redNumbers.remove(index);
        }

        List<Integer> blueNumbers = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            blueNumbers.add(i);
        }
        Collections.shuffle(blueNumbers);
        List<Integer> back = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Collections.shuffle(blueNumbers);
            int index = (int) (Math.random() * blueNumbers.size());
            back.add(blueNumbers.get(index));
            blueNumbers.remove(index);
        }

        front.sort(Comparator.comparing(Function.identity()));
        back.sort(Comparator.comparing(Function.identity()));

        Integer[] frontArray = front.toArray(new Integer[front.size()]);
        Integer[] backArray = back.toArray(new Integer[back.size()]);

        System.out.println(Arrays.toString(frontArray) + ", " + Arrays.toString(backArray));
    }
}