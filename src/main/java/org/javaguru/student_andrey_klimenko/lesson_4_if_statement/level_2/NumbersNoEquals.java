package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны;
- "Numbers are different" - если числа не равны.

В решении воспользоваться оператором не равно (!=).
 */
public class NumbersNoEquals {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
        try {
        num1 = sc.nextInt();
        num2 = sc.nextInt();


        if (num1 != num2) System.out.println("Числа не равны");
        else System.out.println("Числа равны");
    } catch (
    InputMismatchException e) {
        System.out.println("Это не число");
    }
}
}