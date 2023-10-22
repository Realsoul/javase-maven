package com.zx.class01;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class StringDemo {
    public static void main(String[] args) {
        //1. 字符串不可改变
        String zx="周旬";
        zx="void";//实际上重新生成了一个字符串然后赋值给zx
        System.out.println(zx);

        //2. 使用new创建出的是一个""
        String s = new String();
        System.out.println("new String 的结果是"+s+"啊");

        //3. 根据【字符数组】创建
        char[] chs={'a','b','c','6'};
        String s1 = new String(chs);
        System.out.println(s1);

        //4. String 不可修改，因此可以创建字符数组然后变成String
        //需求：abc--> {'a','b','c'}-->{'A','B','D'}->ABD

        //5. 根据【字节数组】创建字符串对象
        //应用场景：在网络中传输的数据都是字节信息
        byte[] bytes={97,98,99,100};
        String s4 = new String(bytes);
        System.out.println(s4); //abcd

        //6. StringTable(串池)在堆内存中，只保留使用直接赋值的字符串对象比如：
        //a和A共享同一个字符串对象，节约了内存
        String a="A";
        String A="A";
        //而采用new创建的，会在堆内存中开辟两块空间，s2和s3不共享，各自拥有地址
        String s2 = new String(chs);
        String s3 = new String(chs);

        //7. 常见方法
        //7.1 比较 地址 ： ==
        String s70= new String("abc");
        String s700 = "abc";
        String s7000 = "abc";
        System.out.println(s70==s700);    //false   s70在堆内存，s700在串池
        System.out.println(s700==s7000);  // true   同一个串池地址

        //比较内容
        String s70000 = "Abc";
        //区分大小写 ： equals
        boolean res1 = s70.equals(s70000);
        System.out.println(res1);  //false
        //忽略大小写
        boolean res2 = s70.equalsIgnoreCase(s70000);
        System.out.println(res2);  //true



    }
}
