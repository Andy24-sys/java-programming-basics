package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_6;
/*
Напишите программу, которая принимает на вход число от 1 до 10
и выводит его эквивалент в виде римской цифры.

Используйте switch для определения соответствующей римской цифры.
 */
class ConvertNumbersToRoman {
    private int number;

    public ConvertNumbersToRoman(int number) {
        this.number = number;
    }

    String convertNumbers (int number){
        return switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "Вне диапазона";
        };
    }

    public int getNumber() {
        return number;
    }
}
