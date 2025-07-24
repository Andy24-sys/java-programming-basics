package org.javaguru.student_andrey_klimenko.lesson_5_methods.level_1;

class WaveLengths {
   private final int numWave;

    public WaveLengths(int numWave) {
        this.numWave = numWave;
    }

    public int getNumWave() {
        return numWave;
    }

    public String waveRange (int numWave){
        if (numWave> 380 && numWave<449){
            return"Violet";
        } else if (numWave > 450 && numWave < 494) {
            return"Blue";
        } else if (numWave > 495 && numWave < 569) {
            return"Green";
        } else if (numWave > 570 && numWave < 589) {
            return"Yellow";
        } else if (numWave > 590 && numWave < 619) {
            return "Orange";
        } else if (numWave > 620 && numWave < 750) {
            return"Red";
        }else {
            return "Невидимый спектр";
        }


    }

}
