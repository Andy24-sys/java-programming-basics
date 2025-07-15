package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_6;

class ConvertNumbersToRomanApp {
    public static void main(String[] args) {
        ConvertNumbersToRoman convertNumbersToRoman1=new ConvertNumbersToRoman(2);
        ConvertNumbersToRoman convertNumbersToRoman2=new ConvertNumbersToRoman(5);
        ConvertNumbersToRoman convertNumbersToRoman3=new ConvertNumbersToRoman(7);
        ConvertNumbersToRoman convertNumbersToRoman4=new ConvertNumbersToRoman(11);

        System.out.println(convertNumbersToRoman1.convertNumbers(convertNumbersToRoman1.getNumber()));
        System.out.println(convertNumbersToRoman2.convertNumbers(convertNumbersToRoman2.getNumber()));
        System.out.println(convertNumbersToRoman3.convertNumbers(convertNumbersToRoman3.getNumber()));
        System.out.println(convertNumbersToRoman4.convertNumbers(convertNumbersToRoman4.getNumber()));
    }
}
