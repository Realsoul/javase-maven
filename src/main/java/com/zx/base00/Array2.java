package com.zx.base00;

public class Array2 {
    //二维数组

    public static void main(String[] args) {
        //1. 声明+定义      非矩形
        int[][] a1=new int[][]{{1,2,3},{4,5,6,7,8}};
        //2. 先声明 后定义  矩形
        int num=1;
        int[][]a2=new int[3][4];
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                a2[i][j]=num++;
            }
        }
        //直接打印的是地址
        System.out.println(a2);
        forI(a1);
        forI(a2);

    }
    public static void forI (int[][] arr2){
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("第"+(i+1)+"行数据开始打印");
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }
        System.out.println("-----------结束打印-----------");
    }

}
