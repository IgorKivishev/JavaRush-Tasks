package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0,"Java");
        map.put(1,"Kotlin");
        map.put(2,"Go");
        map.put(3,"Javascript");
        map.put(4,"Typescript");
        map.put(5,"Python");
        map.put(6,"PHP");
        map.put(7,"C++");
        return map;
    }

}
