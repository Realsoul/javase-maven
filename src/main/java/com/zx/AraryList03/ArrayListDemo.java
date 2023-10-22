package com.zx.AraryList03;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1.创建集合的对象
        /* 泛型:限定集合中存储数据的类型
            基本数据类型要采用包装类：
            char Character
            int Integer
        */
        ArrayList<String> list = new ArrayList<>();
        //这个类在底层做了一些处理
        //打印对象不是地址值，而是集合中存储数据内容
        // 在展示的时候会拿[]把所有的数据进行包裹
        System.out.println(list);//[]

        //2. 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        //3. 删除(可根据值和位置删除元素)
        list.remove("bbb");
        list.remove(0);
        System.out.println(list);
        //4. 修改元素值
        list.set(0,"bbb");
        list.add("aaa");
        System.out.println(list);
        //5. 查询
        String s = list.get(0);
        System.out.println(s);
        //6. 长度
        int size = list.size();
        System.out.println(size);
        //7. 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
