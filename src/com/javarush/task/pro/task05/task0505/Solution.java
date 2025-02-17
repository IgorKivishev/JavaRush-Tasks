package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int array[] = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = s.nextInt();

        }
        if(a%2==0) {
            for (int i = a - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }else
            {
                for (int i = 0; i < a; i++) {
                    System.out.println(array[i]);

                }
            }
        }
    }

