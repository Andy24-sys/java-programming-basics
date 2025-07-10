package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_7;
/*
Создать класс описывающий собаку.
У собаки должна быть кличка и возраст указанный в полных годах.

Сделать так, чтобы объект собаку можно было создать только
указав кличку и возраст.

Научить виртуальную собаку "подавать голос" - при вызове этого
метода собака должна возвращать фразу: "My nickname is " + кличка собаки.

Научить виртуальную собаку "праздновать свой день рождения" - при
вызове этого метода возраст собаки должен увеличиваться на 1 год.

Научить собаку "говорить сколько ей лет" - при вызове этого метода
возвращать возраст собаки в годах.
 */
class Dog {
    private String name;
    private int age;

    public Dog (String name, int age){
        this.name=name;
        this.age=age;
    }
    public void voice(){
        System.out.println("My nickname is "+getName());
    }
    public void Birthday(){
        this.age=age+1;
    }
    public String howManyYears(){
        return "Мне "+getAge()+" лет";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
