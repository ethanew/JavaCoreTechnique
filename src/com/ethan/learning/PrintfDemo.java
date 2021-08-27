package com.ethan.learning;

import java.util.Date;

/**
 * @ClassName PrintfDemo
 * @Description 描述
 * @Date 2021/6/17 16:16
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class PrintfDemo {
    public static void main(String[] args) {
        System.out.printf(10000.0 / 3.0 + "\n");
        System.out.printf("%8.2f", 10000.0 / 3.0);
        System.out.println();
        System.out.printf("%,.2f", 10000.0 / 3.0);
        System.out.println();
        System.out.printf("%.2f", 10000.0 / 3.0);
        System.out.println();
        System.out.printf("%tc", new Date());
        System.out.println();
        System.out.printf("%1$s %2$tB %2$te, %2$tY","Due date:", new Date());
        System.out.println();
        System.out.printf("%s %tB %<te, %<tY","Due date:", new Date());
    }
}