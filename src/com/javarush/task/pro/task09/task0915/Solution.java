package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokens = new StringTokenizer(query, delimiter);
        int tokenCount = tokens.countTokens();
        String result[] = new String[tokenCount];
        int i = 0;
        while(tokens.hasMoreTokens()){
             result[i++] = tokens.nextToken();

        }
        return result;

    }
}
