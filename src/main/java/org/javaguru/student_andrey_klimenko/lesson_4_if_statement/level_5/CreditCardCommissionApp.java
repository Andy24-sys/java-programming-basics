package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_5;

import java.util.Scanner;

public class CreditCardCommissionApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numCash=sc.nextInt();

        CreditCardCommission creditCardCommission=new CreditCardCommission(2000);
        System.out.println("Ваша комиссия -"+creditCardCommission.Commission());
    }
}
