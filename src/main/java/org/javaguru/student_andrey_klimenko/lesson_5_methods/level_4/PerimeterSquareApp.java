package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_4;

public class PerimeterSquareApp {
    public static void main(String[] args) {
        PerimeterSquare perimeterSquare=new PerimeterSquare();

        System.out.println(perimeterSquare.perimeter(23));
        System.out.println(perimeterSquare.square(23));
        System.out.println(perimeterSquare.perimeter(55.6));
        System.out.println(perimeterSquare.square(55.6));
    }
}
