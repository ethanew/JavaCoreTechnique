package com.ethan.learning.arrays;

import java.util.Arrays;

/**
 * @ClassName MatrixArray
 * @Description 描述
 * @Date 2021/6/21 16:39
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class MatrixArray {

    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NYEARS = 10;
        final int NRATES = 6;

        // set interest rates to 10 ... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        // set initial balances to 10000
        double[][] balances = new double[NYEARS][NRATES];
        Arrays.fill(balances[0], 10000.00D);

        // compute interest for future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // get last year's balance from previous row
                double oldBalance = balances[i - 1][j];
                // compute interest
                double interest = interestRate[j] * oldBalance;
                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }
        System.out.println();

        // print balance table
        for (double[] row : balances) {
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(balances));
    }

}