package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        array = new int[a];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            array[i] = s.nextInt();
            if (array[i] > max){
                max = array[i];}
        }

        System.out.println(max);
    }
}
