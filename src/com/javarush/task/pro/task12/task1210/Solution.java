package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        for (int i = 0; i < numbers.size()/2; i++) {
            int j  = numbers.size() - i - 1;
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(j));
            numbers.set(j,temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
