package com.ethan.learning;

import java.util.Scanner;

/**
 * @ClassName ScannerDemo
 * @Description 描述
 * @Date 2021/6/16 17:36
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = in.nextLine();
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.printf("Hello, %s. Next year, you'll be %d.", name, age + 1);
    }
}