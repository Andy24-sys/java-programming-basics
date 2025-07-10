package org.javaguru.student_andrey_klimenko.lesson_2_variables_and_data_types.level_3;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечание: обратите внимание, что результат может быть дробным числом.
 */
public class Arifmetic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1=(double) sc.nextInt();
        System.out.println("Введите второе число: ");
        double num2=(double) sc.nextInt();
        System.out.println("Введите третье число: ");
        double num3=(double) sc.nextInt();
        double arifmeticSum=(num1+num2+num3)/3;

        System.out.println(arifmeticSum);

    }
}
