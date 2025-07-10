package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_2;
/*
Создайте класс описывающий машину со следующими свойствами:
- марка;
- цвет;
- цена.

У класса должен быть конструктор,
для задания начального значения всем свойствам класса.
 */
public class Car {
    private String model;
    private String color;
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
