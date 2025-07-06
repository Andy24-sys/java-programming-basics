package org.javaguru.student_andrey_klimenko.lesson_2_variables_and_data_types.level_3;

import java.util.Scanner;

public class MultyplayNum {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите число: ");
        num=sc.nextInt();
        sc.close();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(num+" * "+i + " = "+ num*i);
        }
    }
}
