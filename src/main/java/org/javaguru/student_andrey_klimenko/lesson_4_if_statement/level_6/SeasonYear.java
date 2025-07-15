package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_6;

/*
Определение сезона года.

Напишите программу, которая принимает месяц
в виде числа от 1 до 12. Программа должна выводить сезон года,
которому этот месяц соответствует.

Найдите информацию про switch оператор, изучите ее
и воспользуйтесь им для определения сезона.
 */
class SeasonYear {
    private final int numMonth;

    public SeasonYear(int numMonth) {
        this.numMonth = numMonth;
    }

    public int getNumMonth() {
        return numMonth;
    }

    String timeYear(int numMonth) {

        return switch (numMonth) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Нет такого месяца";
        };
    }
}


