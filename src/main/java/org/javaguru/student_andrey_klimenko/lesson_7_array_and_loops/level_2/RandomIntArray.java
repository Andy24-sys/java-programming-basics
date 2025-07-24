package org.javaguru.student_andrey_klimenko.lesson_7_array_and_loops.level_2;

import java.util.Random;

/*
Создайте класс RandomIntArray.

В классе напишите метод в котором создаётся массив целых чисел длиной 10
элементов, после создания массив должен заполняться случайными
числами в диапазоне от 0 до 100 и возвращаться в качестве результата.

Создайте второй метод рядом с первым предназначенный для распечатки
массива целых чисел на консоль.

Продемонстрируйте работу этих методов создав класс RandomIntArrayApp.
В main() методе класса RandomIntArrayApp создайте массив случайных
целых чисел вызвал первый метод, а потом распечатайте его на консоль
при помощи второго метода.
 */
class RandomIntArray {
    static int [] nums=new int[10];
    static Random random=new Random();

    public  void rndNum(){

        for (int i = 0; i < nums.length; i++) {
            nums[i]= random.nextInt(100);
        }
    }
    public  void printNum(){
        for (int i:nums){
            System.out.println(i);
        }
    }

}
