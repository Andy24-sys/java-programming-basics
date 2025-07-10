package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_1;
/*
Создайте класс RobotApp (App - Application) с main() методом.
В main() методе продемонстрируйте создание двух роботов с
разными именами.
 */
public class RobotApp {
    public static void main(String[] args) {

        //System.out.println(Robot.class.getName());

        Robot robot1=new Robot("one");
        Robot robot2=new Robot("to");

        System.out.println(robot1.getName());
        robot1.setName("one_one");
        System.out.println(robot1.getName());
        System.out.println(robot2.getName());
        robot2.setName("to_to");
        System.out.println(robot2.getName());
    }
}
