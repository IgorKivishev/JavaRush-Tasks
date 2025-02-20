package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        multiArray = new int[a][];
        for (int i = 0; i < a; i++) {
            int size = s.nextInt();
            multiArray[i] = new int[size];

        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println(multiArray[i][j]+" ");

            }
            System.out.println();
        }



        }

}
