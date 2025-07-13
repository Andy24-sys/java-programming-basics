package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_1;
/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю, то число чётное, иначе не чётное.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumChetNechet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            if (Math.abs(num) % 2 == 0) System.out.println("Число четное");
            else System.out.println("Число не четное");

        } catch (InputMismatchException e) {
            System.out.println("Это не число");
        }
    }
}
