package com.ethan.learning.lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName SixPlusOneLotteryGenerator
 * @Description 福彩-6+1（前区“0-9选6位”＋后区“0-14选1位”）
 * @Date 2021/6/17 17:27
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class SixPlusOneLotteryGenerator {

    public static void main(String[] args) {
        List<Integer> redNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            redNumbers.add(i);
        }
        Collections.shuffle(redNumbers);
        List<Integer> front = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Collections.shuffle(redNumbers);
            int index = (int) (Math.random() * redNumbers.size());
            front.add(redNumbers.get(index));
        }

        List<Integer> blueNumbers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            blueNumbers.add(i);
        }
        List<Integer> back = new ArrayList<>();
        Collections.shuffle(blueNumbers);
        int index = (int) (Math.random() * blueNumbers.size());
        back.add(blueNumbers.get(index));

        Integer[] frontArray = front.toArray(new Integer[front.size()]);
        Integer[] backArray = back.toArray(new Integer[back.size()]);

        System.out.println(Arrays.toString(frontArray) + ", " + Arrays.toString(backArray));
    }
}