package com.zx.test03;

import com.zx.classZip.Phone;

import java.util.ArrayList;

public class phoneArrayList {
    public static void main(String[] args) {
        /* 需求:
            定义]Javabean类:PhonePhone属性:品牌，价格。
            main方法中定义一个集合，存入三个手机对象。 分别为:小米，1000。，8000。锤子2999。
            定义一个方法，将价格低于3000的手机信息返回。
        */

        ArrayList<Phone> phones = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        phones.add(p1);
        phones.add(p2);
        phones.add(p3);

        ArrayList<Phone> res = getPhone(phones);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).getBrand()+res.get(i).getPrice());
        }
    }
    public static ArrayList<Phone> getPhone(ArrayList<Phone> phones){
        ArrayList<Phone> res = new ArrayList<>();

        for (int i = 0; i < phones.size(); i++) {
            Phone phone = phones.get(i);
            int price = phone.getPrice();
            if(price<3000){
                res.add(phone);
            }

        }
        return res;
    }

}
