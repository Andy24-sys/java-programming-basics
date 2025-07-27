package org.javaguru.student_andrey_klimenko.lesson_7_array_and_loops.level_3;
/*
В магазине необходимо подсчитать общую стоимость проданных
товаров и вычислить средний чек покупателей за один день.

Программа на вход должна получать информацию с кассовой ленты
в виде массива объектов кассовый чек за день. То есть в массиве
должны храниться объекты типа кассовый чек.

Объект кассовый чек описывается следующими свойствами:
- номером чека;
- суммой покупки.

Напишите программу, которая рассчитывает общую сумму продаж
и среднюю стоимость покупки.

Протестируйте написанную программу с помощью автоматических тестов.
 */
class Receipt {
    private final String nameReceipt;
    private final double sum;

    public Receipt(String nameReceipt, double sum) {
        this.nameReceipt = nameReceipt;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "nameReceipt='" + nameReceipt + '\'' +
                ", sum=" + sum +
                '}';
    }


    public double getSum() {
        return sum;
    }
}
