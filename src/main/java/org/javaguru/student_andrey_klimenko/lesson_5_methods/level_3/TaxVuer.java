package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_3;

/*
Создайте класс, в котором реализуйте в виде метода
расчет величины налога.

В стране действует прогрессивная ставка налога:
- до 10к евро - налог 30%;
- от 10к до 50к евро - налог 40%;
- свыше 50к евро - налог 50%.

Реализуйте алгоритм таким образом, чтобы его можно было
легко использовать многократно.
Продемонстрируйте использование вашего решения на нескольких примерах,
результаты распечатайте на консоль.

 */
class TaxVuer {
    private int num;

//    public TaxVuer(int num) {
//        this.num = num;
//    }

    public String resultNalog(int num) {
        if (num < 10000) {
            return "налог 30% " + num * 0.3;
        } else if (num > 10000 && num < 50000) {
            return "налог 40% " + num * 0.4;
        } else if (num > 50000) {
            return "налог 50% " + num * 0.5;
        }
        return null;
    }
}

