package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_1;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соответствующий
этому числу день недели. Решите задачу используя оператор if () else.

Пример:
Ввод: 3
Вывод: Wednesday

Ввод: 5
Вывод: Friday
 */
class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(pintDay(num));

    }

    static String pintDay(int num) {

        if (num == 1) return "Понедельник";
        else if (num == 2) return "Вторник";
        else if (num == 3) return "Среда";
        else if (num == 4) return "Четверг";
        else if (num == 5) return "Пятница";
        else if (num == 6) return "Суббота";
        else if (num == 7) return "Воскресение";
        else throw new IllegalArgumentException("Такого дня недели не существует");

    }

}
