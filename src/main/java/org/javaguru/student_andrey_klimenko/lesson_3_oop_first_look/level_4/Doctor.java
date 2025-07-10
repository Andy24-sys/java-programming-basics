package org.javaguru.student_andrey_klimenko.lesson_3_oop_first_look.level_4;

import java.util.Date;

/*
Создайте классы описывающие запись пациентов к врачу на один день.
Врач каждый день делает только два приёма:
- 10:00-12:00;
- 14:00-16:00.

Расписание врача на один день
описывается следующими свойствами:
- имя и фамилия врача;
- специальность (зубной, ухо горло нос, ...);
- дата приёма;
- запись на приём 10:00-12:00;
- запись на приём 14:00-16:00.

Запись на приём - это объект у которого есть:
- имя и фамилия пациента;
- диагноз;
- стоимость визита.

У каждого класса должен быть конструктор,
для задания начального значения всем свойствам класса.
 */
class Doctor {

    private String nameFirst;
    private String nameLast;
    private String special;
    private Date date;

    private DoctorAppoint appoint1;
    private DoctorAppoint appoint2;

    public Doctor(String nameFirst, String nameLast, String special, Date date,
                  DoctorAppoint appoint1, DoctorAppoint appoint2) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.special = special;
        this.date = date;
        this.appoint1 = appoint1;
        this.appoint2 = appoint2;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                ", special='" + special + '\'' +
                ", date=" + date +
                ", appoint1=" + appoint1 +
                ", appoint2=" + appoint2 +
                '}';
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public String getSpecial() {
        return special;
    }

    public Date getDate() {
        return date;
    }

    public DoctorAppoint getAppoint1() {
        return appoint1;
    }

    public DoctorAppoint getAppoint2() {
        return appoint2;
    }
}
