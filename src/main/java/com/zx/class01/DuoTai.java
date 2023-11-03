package com.zx.class01;

public class DuoTai {
    public static void main(String[] args) {
        /* 1. 什么是多态? 同类型的对象，表现出的不同形态。（同一个父类的多种子类表现形式）
           2. 多态的表现形式： 父类类型 对象名称= 子类对象;
           3. 多态的前提：
                有继承关系
                有父类引用指向子类对象
                有方法重写
           4.多态的好处?
           使用父类型作为参数，可以接收【所有子类对象】，体现多态的扩展性与便利。

        */

//         5. 多态调用成员的特点:
//              变量调用:编译看左边，运行也看左边。
//              方法调用︰编译看左边，运行看[右]边。
        Animal a = new Dog();
        System.out.println(a.name);  // 以爸之钱
        a.show();// 行我之事
        // 因为a是Animal类型的，所以会默认从Animal里找变量和方法
        // 成员变量：子类对象中会把父类成员变量也继承
        //成员方法：如果子类对该方法重写，那么虚方法表中会把父类方法覆盖

//        6. 多态的优势
//        a. 在多态形式下，右边对象可以实现解耦合，便于扩展和维护。
            // 一开始让狗狗show,后来换了老鼠;
            // Animal animal =new Dog();  a.show()
            // 那就重新new一个老鼠类，代码只需要改Dog()为老鼠()即可
        // b. 定义方法的时候，使用父类型作为参数，可以接收所有子类对象，体现多态的扩展性与便利。
//        7. 多态的缺点： 不能调用子类特有方法。因为编译看左边父类，没有该方法直接报错。
         // 解决方法：转为子类型后调用   Dog d =(Dog)a  ;   if(a instanceof Dog d)的含义是如果a为dog则强转Dog d =(Dog)a
    }
}

class Animal{
    String name="动物";
    public void show(){
        System.out.println("Animal---show方法");
    }
}
class Dog extends Animal{
    String name="六六";
    @Override
    public void show(){
        System.out.println("Dog---show方法");
    }
}
class Cat extends Animal{
    String name="花花";
    @Override
    public void show(){
        System.out.println("Cat---show方法");
    }
}