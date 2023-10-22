package com.zx;

import java.util.Random;

public class verifyCode {
    /* 需求：
        定义方法实现随机产生一个5位数的验证码，格式：
        长度为5，前四位是大写字母或小写字母，最后一位是数字
    */


    public static void main(String[] args) {
        //1. 大小写字母放数组中
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            //先添加小写字母
            if(i<=25){
                //字母A的ASCII码是65
                chars[i]=(char)(65+i);
            }else{
                //字母a的ASCII码是97
                chars[i]=(char)(97+i-26);
            }
        }
        String res="";
        //2.随机抽取4次
        //随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int rIndex = r.nextInt(chars.length);
            res=res+chars[rIndex];
        }

        //3.随机产生一个数字0~9
        int num = r.nextInt(10);
        System.out.println("验证码是："+res+num);
    }
}
