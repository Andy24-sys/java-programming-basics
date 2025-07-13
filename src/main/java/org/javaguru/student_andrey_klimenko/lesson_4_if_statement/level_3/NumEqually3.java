package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_3;
/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в комментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumEqually3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();


            if (num1 > num2 && num1>num3) System.out.println("Число "+num1+" максимальное");
            else if (num2 > num1 && num2>num3)System.out.println("Число "+num2+" максимальное");
            else System.out.println("Число "+num3+" максимальное");
        } catch (InputMismatchException e) {
            System.out.println("Это не число");
        }
    }
}