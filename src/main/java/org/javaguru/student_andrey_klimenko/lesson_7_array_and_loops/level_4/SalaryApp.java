package org.javaguru.student_andrey_klimenko.lesson_7_array_and_loops.level_4;

import java.util.ArrayList;
import java.util.List;

class SalaryApp {
    public static void main(String[] args) {
        List<Salary> salaries=new ArrayList<>();
        salaries.add(new Salary(2500));
        salaries.add(new Salary(3200));
        salaries.add(new Salary(1800));
        salaries.add(new Salary(4000));
        salaries.add(new Salary(2900));

        SalaryCalculate calculate = new SalaryCalculate();
        System.out.println("Сумма - "+calculate.salarySum(salaries));
        System.out.println("Min - "+calculate.salaryMin(salaries));
        System.out.println("Max - "+calculate.salaryMax(salaries));
        System.out.println("Среднее арифметическое - "+calculate.salaryAverage(salaries));
        calculate.salarySquareDifference(salaries);
        System.out.println("Среднее арифметическое квадратов разности - "+calculate.salaryAverageSquareDifference());
        System.out.println("Корень из среднего арифметического квадратов разности - "+calculate.salaryAverageSquareDifferenceSqrt());


    }


}
