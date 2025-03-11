package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if(decimalNumber <=0) {
            return "";
        }
        String binaryNumber = "";
        while(decimalNumber!=0){
            int remainder =  decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            decimalNumber /= 2;


        }
        return binaryNumber;

    }

    public static int toDecimal(String binaryNumber) {
               if(binaryNumber == null || binaryNumber.isEmpty()){
            return 0;
        }
        int octalNumber = 0;
        int length = binaryNumber.length();
        for (int i = 0; i < length; i++) {
           int bit = binaryNumber.charAt(length - 1 - i) - '0';
            octalNumber += bit*Math.pow(2, i);

        }
        return octalNumber;
    }
}



