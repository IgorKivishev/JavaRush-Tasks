package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Ser", 4.0);
        grades.put("Alex", 5.0);
        grades.put("Kio", 3.0);
        grades.put("JJ", 2.0);
        grades.put("Ori", 1.0);
    }
}
