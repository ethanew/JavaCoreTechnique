package com.ethan.learning.lottery;

import java.util.*;
import java.util.function.Function;

/**
 * @ClassName SevenStarLotteryGenerator
 * @Description 体彩-七星彩（前区“0-9选6位”＋后区“12生肖选1位”）
 * @Date 2021/6/17 17:27
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class SevenStarLotteryGenerator {

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

        List<String> zodiacs = Arrays.asList("鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪");
        List<String> back = new ArrayList<>();
        Collections.shuffle(zodiacs);
        int index = (int) (Math.random() * zodiacs.size());
        back.add(zodiacs.get(index));

        Integer[] frontArray = front.toArray(new Integer[front.size()]);
        String[] backArray = back.toArray(new String[back.size()]);

        System.out.println(Arrays.toString(frontArray) + ", " + Arrays.toString(backArray));
    }
}