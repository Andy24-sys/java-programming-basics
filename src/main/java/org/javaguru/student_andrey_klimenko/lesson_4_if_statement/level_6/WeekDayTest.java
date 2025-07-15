package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_6;

public class WeekDayTest {
    //1 подготовка тестовых данных
    // 2->"Вторник"         (expected(ожидаемый) result)test case 1
    // 7 -> "Воскресение"   test case 2
    // 25-> "Вне диапазона" test case 3

    // вызов кода 2->?

    // проверка
    public static void main(String[] args) {
        WeekDayTest test = new WeekDayTest();

        test.test1();
        test.test2();
        test.test3();

    }

    public void test1() {
        int num = 2;
        WeekDay weekDay = new WeekDay(num);
         String string = weekDay.numWeekDay(num);

         if (string.equals("Вторник")) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }

    }

    public void test2() {
        int num = 7;
        WeekDay weekDay = new WeekDay(num);
        String string = weekDay.numWeekDay(num);
        if (string.equals("Воскресение")) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }

    }

    public void test3() {
        int num = 25;
        WeekDay weekDay = new WeekDay(num);
        String string = weekDay.numWeekDay(num);
        if (string.equals("Вне диапазона")) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }

    }

}
