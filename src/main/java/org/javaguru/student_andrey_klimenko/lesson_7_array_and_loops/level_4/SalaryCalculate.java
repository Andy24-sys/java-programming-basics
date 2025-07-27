package org.javaguru.student_andrey_klimenko.lesson_7_array_and_loops.level_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SalaryCalculate {
    List<Double> squareList = new ArrayList<>();

    public double salarySum(List<Salary> salaries) {
        double sum = 0;
        for (Salary resSalary : salaries) {
            sum += resSalary.getSalaryCache();
        }
        return sum;
    }

    public double salaryMin(List<Salary> salaries) {
        salaries.sort(Comparator.comparing(Salary::getSalaryCache));
        return salaries.getFirst().getSalaryCache();
    }

    public double salaryMax(List<Salary> salaries) {
        salaries.sort(Comparator.comparing(Salary::getSalaryCache));
        return salaries.getLast().getSalaryCache();
    }

    public double salaryAverage(List<Salary> salaries) {
        return salarySum(salaries) / salaries.size();
    }

    public void salarySquareDifference(List<Salary> salaries) {

        double numAverage = salaryAverage(salaries);
        for (Salary salary : salaries) {
            double num = salary.getSalaryCache() - numAverage;
            num = Math.pow(num, 2);
            squareList.add(num);
//            salaryAverageSquareDifference(num,salaries.size());
            System.out.println("Квадрат разности числа - " +
                    salary.getSalaryCache() + " = " + num);
        }
    }

    public double salaryAverageSquareDifference() {
        double sum = 0;
        for (double squareSalary : squareList) {
            sum += squareSalary;
        }
        return sum / squareList.size();

    }

    public double salaryAverageSquareDifferenceSqrt(){
        return Math.sqrt(salaryAverageSquareDifference());
    }
}
