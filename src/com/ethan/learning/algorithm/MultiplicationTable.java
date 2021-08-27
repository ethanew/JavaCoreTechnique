package com.ethan.learning.algorithm;

/**
 * @ClassName MultiplicationTable
 * @Description 描述
 * @Date 2021/6/25 0:23
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int[][] odds = new int[9][];
        String[][] tables = new String[9][];
        for (int i = 1; i <= odds.length; i++) {
            odds[i - 1] = new int[i];
            tables[i - 1] = new String[i];
        }
        for (int i = 0; i < odds.length; i++) {
            for (int j = 0; j < odds[i].length; j++) {
                tables[i][j] = (j + 1) + " X " + (i + 1) + " = " + (j + 1) * (i + 1);
            }
        }
        for (String[] row : tables) {
            for (String odd : row) {
                System.out.printf("%s", odd);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}