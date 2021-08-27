package com.ethan.learning;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @ClassName ScannerDemo1
 * @Description 描述
 * @Date 2021/6/17 16:39
 * @Author wei.liu@youhualin.com
 * @Copyright 悠桦林信息科技公司(上海)有限公司
 * @Version 1.0
 */
public class ScannerDemo1 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(System.getProperty("user.dir") + File.separator + "myfile.txt");
        Scanner in = new Scanner(path, "UTF-8");
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        PrintWriter out = new PrintWriter(System.getProperty("user.dir") + File.separator + "newfile.txt","UTF-8");
        while (in.hasNext()) {
            String line = in.nextLine();
            System.out.println(line);
            out.write(line + "\n");
        }
        out.close();
    }
}