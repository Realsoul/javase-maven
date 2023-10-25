package com.zx.class01;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //1. 创建对象：
        StringBuilder sb = new StringBuilder();
        System.out.println(sb); //输出空
        /*
        * StringBuilder 是Java已经写好的类，打印对象不是地址值而是属性值
        * */

        StringBuilder sb1 = new StringBuilder("abc");
        System.out.println(sb1); //输出 abc

        //2. 添加元素
        sb1.append(1);
        sb1.append(" ");
        sb1.append(true);
        System.out.println(sb1); //abc1 true

        //3. 反转
        sb1.reverse();
        System.out.println(sb1); //eurt 1cba

        //4. 替换
        sb1.reverse();
        sb1.replace(4,5,"false");// abc1falsetrue
        System.out.println(sb1);
        /*
         * 与String不同的是，不形成新的，直接在原来对象基础上修改的值
         * */
        String s="abc";
        String ss = s.replace("a", s);
        System.out.println("s-->"+s); // s-->abc
        System.out.println("ss-->"+ss);//ss-->abcbc

        //5. 长度（已经装了多少个字符串）
        System.out.println(sb1.capacity()); // 容量：最多能装多少
        System.out.println(sb1.length());

        //6. 变回字符串：toString
        String sb2=sb1.toString()+"!!!";
        sb1.append(sb2);
        System.out.println("sb2 is :"+ sb2);
        System.out.println(sb2.toString());

        //7. 链式编程
        //调用一个方法时不需要接收他的结果，继续调用其他方法
        System.out.println(getString().replace("1", "one").length());

        //8. StringJoiner 可指定间隔符和起止符
        StringJoiner sj = new StringJoiner("->","[","}");
        sj.add("a");
        sj.add("b");
        System.out.println(sj);

        //9. 三个类的底层原理：https://www.bilibili.com/video/BV17F411T7Ao?p=107&spm_id_from=pageDriver&vd_source=0c76bb886f0646e15627273b09e0f577
        /*
         * 1. String: 表示字符串的类，定义了很多操作字符串的方法
         * 2. StringBuilder: 一个[可变]的操作字符串的容器。可以高效的拼接字符串，还可以将容器里面的内容反转。
         * 3. StringJoiner: JDK8出现的一个[可变]的操作字符串的容器，可以高效，方便的拼接字符串。在拼接的时候，可以指定间隔符号，开始符号，结束符号。
        */
        String c1="abc";  //串池地址c1
        String c2="ab";
        String c3=c2+"c";
        System.out.println(c1==c3);
        /*字符串拼接的时候，如果有变量:
            JDK8以前:系统底层会自动创建一个StringBuilder对象，然后再调用其append方法完成拼接。
        拼接后，再调用其toString方法转换为String类型，而toString方法的底层是直接new了一个字符串对象。
        因此C3涉及一个new的StringBuilder内存对象+一个new 的 String内存对象
            JDK8版本:系统会预估要字符串拼接之后的总大小，把要拼接的内容都放在数组中，此时也是产生一个新的字符串。
            涉及一个new 的 String内存对象
        */
//        c1="abc";  //串池地址c1
        String c4="a"+"b"+"c";  //在编译的时候，就会将"a" +"b" +"c"拼接为"abc",赋值操作，无new，复用C1的串池地址
        System.out.println(c1==c4);  //true


        //10. 容量 and 扩容
        StringBuilder sbb = new StringBuilder();
        System.out.println("capacity is: "+sbb.capacity()); // 16
        /*
            默认创建一个长度为16的字节数组添加的内容长度小于16，直接存
            添加的内容大于16会扩容（原来的容量*2+2)
            如果扩容之后还不够，以实际长度为准
         */



    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        return str;

    }
    
        

}
