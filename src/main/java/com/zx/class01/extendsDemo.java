package com.zx.class01;

public class extendsDemo {
    public static void main(String[] args) {
        //什么时候用继承?
        //当类与类之间，存在相同(共性)的内容，并满足子类是父类中的一种，就可以考虑使用继承，减少代码冗余，提高代码的复用性

        //继承后子类的特点?
        //子类可以得到父类的属性和行为，子类可以使用。子类可以在父类的基础上新增其他功能，子类更强大。

        //java不支持多继承只支持多层继承。最大的祖类object

        /* 子类可以继承和调用父类的那些成分？ */
        //1. 关于构造方法： 父类构造方法不能被子类继承（如果可以，构造方法就与子类名不一致），但可以通过super()调用
            /* 子类中的构造方法默认先访问父类的无参构造，完成对父类数据空间的初始化，再执行自己（
                因为有可能会用到父类的数据，如果父类没有初始化子类无法使用。
                一般在子类构造方法的第一句默认是：super(),不写也存在，且在第一行
             */


        //2. 关于成员变量：不论privite,子类都可以继承，但privite变量子类不能访问（儿子继承了父亲带🔒的钱柜）
        //3. 关于成员方法：
            // 父类的虚方法表：非private,非static，非final
            //只有父类中的虚方法才能被子类继承

        //继承中成员变量的访问特点：就近原则
        //局部位置--》本类成员位置（this）--》父类成员位置(super)


        //子类重写父类方法需要用@Overwrite修饰（实质是覆盖了虚方法表里的方法）
        // 重写方法的名称和形参列表必须与父类一致
        //子类重写的方法访问权限必须>=父类（空着不写>protect>private）
        // 子类返回值类型(Dog)必须小于等于父类（Animal）
        //父类私有方法不能被子类重写
        //父类静态方法不能被子类重写


        //this  vs  super
        // this： 表示当前方法的调用者的地址
        //super: 代表父类的存储空间
    }
}