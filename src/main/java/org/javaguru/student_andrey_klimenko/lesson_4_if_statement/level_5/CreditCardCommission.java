package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_5;

class CreditCardCommission {
    private final double cash;

    public CreditCardCommission(double cash) {
        this.cash = cash;
    }

public double Commission(){
        double percentCommission = 0;
        if (cash<1000){
            percentCommission= cash*0.03;
        } else if (cash > 1000 && cash < 5000) {
            percentCommission=cash*0.04;
        }else if(cash>5000) {
            percentCommission = cash * 0.05;
        }else {
            System.out.println("Сумма не определена");

        }

    return percentCommission;
}
}

