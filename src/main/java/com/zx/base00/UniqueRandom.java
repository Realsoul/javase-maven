package com.zx.base00;


import java.util.Random;

public class UniqueRandom {
    //奖品{2，588，888，1000，10000},随机抽奖，不可重复
    //随机不重复抽样

    //1.放入数组
    //2. 打乱
    //3.遍历

    public static void main(String[] args) {
        int[] arr = new int[]{2,588,888,1000,10000};
        shuffle(arr);
        printArr(arr);
    }


    public static void shuffle(int[] arrays){
        Random r = new Random();

        for (int i = 0; i < arrays.length; i++) {
            int rIndex=r.nextInt(arrays.length);
            int temp=arrays[i];
            arrays[i]=arrays[rIndex];
            arrays[rIndex]=temp;
        }
    }

    public static void printArr(int[] arrays) {
        for (int i : arrays) {
            System.out.println(i);
        }
    }

}
