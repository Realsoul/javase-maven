package com.zx.class01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /*键盘录入：
            体系1：
                nextInt():整数
                nextDouble():小数
                next():字符串
                遇到空格、制表符、回车 就停止接收
            体系2：
                nextLine:字符串
                遇到回车才停止接收

            不能混用：
            若先用nextInt()接着又用nextLine()会导致后者接收不到数据。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");  // 123 456
        int num = sc.nextInt();
        System.out.println(num);   //123
        int num2 = sc.nextInt();
        System.out.println(num2); // 456


        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入一个整数：");  // 123 456
        String s = sc2.nextLine();
        System.out.println(s);   //123
    }
}
