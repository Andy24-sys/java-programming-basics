package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_2;

/*
Создайте в классе Car get() методы для каждого свойства.
Воспользуйтесь созданными методами
в классе CarApp для вывода значений свойств машин на консоль.

 */
public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan", "red", 1200);
        Car car2 = new Car("Logan", "blue", 600);
        Car car3 = new Car("Ford", "black", 800);

        System.out.println(car1);
        System.out.println(car1.getModel());
        System.out.println(car2);
        System.out.println(car2.getColor());
        System.out.println(car2.getPrice());
        System.out.println(car3.getModel() + ", " + car3.getPrice());

        car1.setColor("green");
        System.out.println(car1);
    }
}
