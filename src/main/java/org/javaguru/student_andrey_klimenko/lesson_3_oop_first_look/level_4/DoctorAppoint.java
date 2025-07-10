package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_4;

public class DoctorAppoint {
    private String nameFirst;
    private String nameLast;
    private String diagnosis;
    private int priceAppoint;

    public DoctorAppoint(String nameFirst,
                         String nameLast,
                         String diagnosis,
                         int priceAppoint) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.diagnosis = diagnosis;
        this.priceAppoint = priceAppoint;
    }

    @Override
    public String toString() {
        return "DoctorAppoint{" +
                "nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", priceAppoint=" + priceAppoint +
                '}';
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getPriceAppoint() {
        return priceAppoint;
    }
}
