package org.javaguru.student_andrey_klimenko.lesson_4_if_statement.level_6;

class MaxNumberTest {

    //1. 1,2,3,->3
    //2. -1,2,4->4
    //3. 1,3,3->3

    public static void main(String[] args) {
        MaxNumberTest maxNumberTest = new MaxNumberTest();

        maxNumberTest.test1();
        maxNumberTest.test2();
        maxNumberTest.test3();
    }

    public void test1() {
        MaxNumber maxNumber = new MaxNumber();
        int maxResult = maxNumber.findMax(1, 2);
        int maxResult1 = maxNumber.findMax(maxResult, 3);

        checkResult(maxResult1, 3, "1");
    }

    public void test2() {
        MaxNumber maxNumber = new MaxNumber();
        int maxResult = maxNumber.findMax(-1, 2);
        int maxResult1 = maxNumber.findMax(maxResult, 4);

        checkResult(maxResult1, 4, "2");
    }

    public void test3() {
        MaxNumber maxNumber = new MaxNumber();
        int maxResult = maxNumber.findMax(1, 3);
        int maxResult1 = maxNumber.findMax(maxResult, 3);

        checkResult(maxResult1, 3, "3");
    }


    private void checkResult(int realResult,
                             int expectedResult,
                             String testName) {
        if (realResult == expectedResult) {
            System.out.println("Test " + testName + " = OK");
        } else {
            System.out.println("Test " + testName + " = FAIL");
            System.out.println("Real result = " + realResult);
            System.out.println("Expected result = " + expectedResult);
        }
    }
}
