package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_6;

class WeekDay {
    private int num;

    public WeekDay(int num) {
        this.num = num;
    }

    String numWeekDay(int num) {

        return switch (num) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресение";
            default -> "Вне диапазона";
        };
    }

    public int getNum() {
        return num;
    }
}
