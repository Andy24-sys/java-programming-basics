package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_5;

class CreditCardCommission {
    private int cash;

    public CreditCardCommission(int cash) {
        this.cash = cash;
    }

public int Commission(){
        int percentCommission = 0;
        if (cash<1000){
            percentCommission= (int) (cash*0.03);
        } else if (cash > 1000 && cash < 5000) {
            percentCommission=(int) (cash*0.04);
        }else if(cash>5000) {
            percentCommission = (int) (cash * 0.05);
        }else {
            System.out.println("Сумма не определена");

        }

    return percentCommission;
}
}

