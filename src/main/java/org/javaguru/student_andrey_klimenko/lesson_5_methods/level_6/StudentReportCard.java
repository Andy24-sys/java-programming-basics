package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_6;
/*
Расчет средней оценки в табеле школьника.

Табель школьника это объект, придумать как этот объект выглядит.

Написать программу, в которую подается объект табель школьника
и по нему высчитывается средний бал.

Реализуйте алгоритм таким образом, чтобы его можно было
легко использовать многократно.

Продемонстрируйте использование вашего решения на нескольких примерах,
результаты распечатайте на консоль.
 */
class StudentReportCard {

    public String averageScore(String object1, double num1,String object2, double num2,
                               String object3, double num3){

        return "Предметы: \n"
                +object1+" "+num1+"\n"
                +object2+" "+num2+"\n"
                +object3+" "+num3+"\n"
                +"Средний балл - "+(num1+num2+num3)/3;
    }
}
