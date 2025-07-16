package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_1;

public class WaveLengthsApp {
    public static void main(String[] args) {
        WaveLengths waveLengths=new WaveLengths(455);
        WaveLengths waveLengths1=new WaveLengths(500);
        WaveLengths waveLengths2=new WaveLengths(575);
        WaveLengths waveLengths3=new WaveLengths(595);
        WaveLengths waveLengths4=new WaveLengths(755);



        System.out.println(waveLengths.waveRange(waveLengths.getNumWave()));
        System.out.println(waveLengths1.waveRange(waveLengths1.getNumWave()));
        System.out.println(waveLengths2.waveRange(waveLengths2.getNumWave()));
        System.out.println(waveLengths3.waveRange(waveLengths3.getNumWave()));
        System.out.println(waveLengths4.waveRange(waveLengths4.getNumWave()));

    }
}
