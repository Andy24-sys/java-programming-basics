package org.javaguru.student_andrey_klimenko.lesson_2_variables_and_data_types.level_3;
/*Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

import java.util.Scanner;

class PerimArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        double rad = sc.nextDouble();

        System.out.println("Perimeter is = " + periMetrCircl(rad));
        System.out.println("Area is = " + areaCircl(rad));


    }

    public static double periMetrCircl(double rad) {
        return Math.PI * 2 * rad;
    }

    public static double areaCircl(double rad) {
        return rad * rad * Math.PI;
    }
}
