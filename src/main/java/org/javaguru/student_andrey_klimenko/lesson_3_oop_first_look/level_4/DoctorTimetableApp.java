package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_4;

import javax.xml.crypto.Data;
import java.util.Date;

public class DoctorTimetableApp {
    public static void main(String[] args) {

        DoctorAppoint appoint1=new DoctorAppoint("Вася","Васильев",
                "Зуб болит",100);
        DoctorAppoint appoint2=new DoctorAppoint("Петя","Иванов",
                "Челюсть выпадает",200);

        Doctor doctor=new Doctor("Петрова","Лидия", "Стоматолог", new Date(),appoint1,appoint2);

        System.out.println("Пациент1 -"+appoint1.getNameFirst()+" "+appoint1.getNameLast()+" "+appoint1.getDiagnosis());
        System.out.println("Пациент2 -"+appoint2.getNameFirst()+" "+appoint2.getNameLast()+" "+appoint2.getDiagnosis());
        System.out.println(doctor);


    }
}
