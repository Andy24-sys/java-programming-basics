package org.javaguru.student_andrey_klimenko.lesson_6_unit_testing.level_1;
/*
Написать автоматические тесты на класс TriangleSquare
в котором реализован расчёт площади треугольника по формуле Герона.

Класс TriangleSquare лежит рядом с этим файлом задания.

Для выполнения задания скопируйте класс TriangleSquare к себе в пакет.

Создайте класс TriangleSquareTest и добавьте в него
необходимые тестовые методы.

PS: оба public метода должны быть протестированы отдельно друг от друга!

Цели:
- закрепить навык написания автоматических тестов;
- тренировка в генерации тестовых вариантов;
- повторение трёх шагов в написании автоматических тестов:
    подготовка тестовых данных,
    вызов продакшн кода,
    проверка результата.
 */
class TriangleSquare {

    public double calculateSquare(int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;
    }

}
