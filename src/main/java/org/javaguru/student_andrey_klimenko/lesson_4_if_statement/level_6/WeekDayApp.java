package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_6;

class WeekDayApp {
    public static void main(String[] args) {
        WeekDay weekDay1=new WeekDay(2);
        WeekDay weekDay2=new WeekDay(5);
        WeekDay weekDay3=new WeekDay(1);
        WeekDay weekDay4=new WeekDay(4);
        WeekDay weekDay5=new WeekDay(12);

        System.out.println(weekDay1.getNum());
        System.out.println(weekDay1.numWeekDay(weekDay1.getNum()));
        System.out.println(weekDay2.numWeekDay(weekDay2.getNum()));
        System.out.println(weekDay3.numWeekDay(weekDay3.getNum()));
        System.out.println(weekDay4.numWeekDay(weekDay4.getNum()));
        System.out.println(weekDay5.numWeekDay(weekDay5.getNum()));
    }
}
