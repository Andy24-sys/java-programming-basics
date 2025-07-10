package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_1;
/*
Создайте класс робот (Robot) с одним свойством - имя.
У класса должен быть конструктор с одним параметром,
для задания начального значения имени робота.
 */
public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
