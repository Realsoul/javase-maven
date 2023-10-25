package com.zx.test03;

/*调整字符串
    给定两个字符串,A和B。
    例如,若A= 'abcde'，在移动一次之后结果就是'bcdea'。
    如果在若干次调整操作之后，A能变成B，那么返回True。
    如果不能匹配成功，则返回false
 */
public class rotateString {
    public static void main(String[] args) {
        String strA="abcde";
        String strB="cdeab";
        boolean checkRes = check(strA, strB);
        System.out.println(checkRes);

    }
    //字符串首位置后
    //套路:
    //如果我们看到要修改字符串的内容/可以有两个办法:
    //method1. 用substring进行截取，把左边的字符截取出来拼接到右侧去
    //method2. 可以把字符串--> 字符数组，然后调整字符数组里面数据，字符数组-->字符串。

    public static String rotateStr1(String str){
        char c = str.charAt(0);
        String s = str.substring(1);
        return s+c;
    }
    public static String rotateStr2(String str){
        char[] chs=str.toCharArray();
        char c = chs[0];
        for (int i = 1; i < chs.length; i++) {
            chs[i-1]=chs[i];
        }
        chs[chs.length-1]=c;
//        System.out.println(chs.toString());  //字符数组.toString后是地址值
        String res = new String(chs);
        return res;
    }

    public static boolean check(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            //字符串值比较使用equals
            str1=rotateStr2(str1);
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }
}


/*
* 字符数组-->字符串： String 字符串 = new String(字符数组)
* 字符串-->字符数组： char[] 字符数组 =字符串.toCharArray()
* 字符串内容比较： equals   地址比较： ==
* */