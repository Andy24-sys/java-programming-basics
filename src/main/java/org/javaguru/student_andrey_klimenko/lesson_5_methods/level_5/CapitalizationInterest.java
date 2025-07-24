package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_5;

/*
Создайте класс, в котором реализуйте в виде метода
расчет формулы сложно процента. Саму формулу найдите в интернете.

Реализуйте алгоритм таким образом, чтобы его можно было
легко использовать многократно.

Продемонстрируйте использование вашего решения на нескольких примерах,
результаты распечатайте на консоль.

Формула сложного процента (капитализации процентов): A = P × (1 + r/n)^(n×t), где:
A — итоговая сумма;
P — начальная сумма;
r — годовая процентная ставка (в десятичной форме);
n — количество начислений процентов в год (например, ежемесячно, ежеквартально);
t — срок вклада в годах.
Если проценты начисляются раз в год, формула упрощается: A = P × (1 + r)^t,
 */
class CapitalizationInterest {
//    private double initialAmount;//начальная сумма
//    private double annualInterestRate;//годовая процентная ставка
//    private int depositPeriod;//срок вклада в годах

    public String capitalizationInterest(double initialAmount, double annualInterestRate, int depositPeriod) {
        return "Ставка- "+annualInterestRate+"%, итого вклад = " + (int)((initialAmount * Math.pow((1 + annualInterestRate/100), depositPeriod)));
    }
}
