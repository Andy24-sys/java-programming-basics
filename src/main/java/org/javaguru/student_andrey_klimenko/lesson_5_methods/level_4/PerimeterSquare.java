package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_4;
/*
S = π * r²
P = 2πr
 */

class PerimeterSquare {

    private double radius;

    public String perimeter(double radius){
        return "Периметр круга = "+Math.PI*radius*radius;
    }
    public String square(double radius){
        return "Площадь круга = "+2*Math.PI*radius;
    }
}
