package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_7;

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Dayl", 4);

        System.out.println(dog);

        dog.Birthday();
        dog.Birthday();

        System.out.println(dog);
        dog.voice();

        System.out.println(dog.howManyYears());
    }
}
