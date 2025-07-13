package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, мож
но использовать только if else.
 */
public class NumEqually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();


        if (num1 > num2) System.out.println("Первое число больше второго");
        else System.out.println("Второе число больше первого");
    } catch (InputMismatchException e) {
        System.out.println("Это не число");
    }
    }
}
