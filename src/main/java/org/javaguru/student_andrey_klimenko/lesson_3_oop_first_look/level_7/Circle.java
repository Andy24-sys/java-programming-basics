package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_7;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
