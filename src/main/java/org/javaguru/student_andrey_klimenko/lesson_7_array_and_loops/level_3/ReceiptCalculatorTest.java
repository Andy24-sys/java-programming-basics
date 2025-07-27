package org.javaguru.student_andrey_klimenko.lesson_7_array_and_loops.level_3;

class ReceiptCalculatorTest {
    /*
    test1 - receiptsNull-чеков 0 Итоговая сумма чеков->0.0
    test2 - receiptsNotNull-чеков 2.5, 3,5 Итоговая сумма чеков->6.0
    test3 - receiptsNullAverage-чеков 0 Итоговая средний чек->0.0
    test4 - receiptsNotNullAverage-чеков 4.3, 2,7 Итоговая средний чек->7.0
    */
    public static void main(String[] args) {
        ReceiptCalculatorTest test = new ReceiptCalculatorTest();
        test.receiptsNull();
        test.receiptsNotNull();
        test.receiptsNullAverage();
        test.receiptsNotNullAverage();
    }

    public void receiptsNull() {
        Receipt[] receipts = {};
        ReceiptCalculator calculator=new ReceiptCalculator();
        double totalSum=calculator.calculate(receipts);
        checkResult(totalSum,0.0,"receiptsNull");
    }

    public void receiptsNotNull() {
        Receipt[] receipts = {
                new Receipt("n1",2.5),
                new Receipt("n2",3.5),
        };
        ReceiptCalculator calculator=new ReceiptCalculator();
        double totalSum=calculator.calculate(receipts);
        checkResult(totalSum,6.0,"receiptsNotNull");
    }

    public void receiptsNullAverage() {
        Receipt[] receipts = {};
        ReceiptCalculator calculator=new ReceiptCalculator();
        double totalSum=calculator.receiptAverage(receipts);
        checkResult(totalSum,0.0,"receiptsNullAverage");
    }

    public void receiptsNotNullAverage() {
        Receipt[] receipts = {
                new Receipt("n1",4.3),
                new Receipt("n2",2.7),
        };
        ReceiptCalculator calculator=new ReceiptCalculator();
        double totalSum=calculator.receiptAverage(receipts);
        checkResult(totalSum,3.5,"receiptsNotNullAverage");
    }


    public void checkResult (double realResult, double expectedResult, String testScenarioName){
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
