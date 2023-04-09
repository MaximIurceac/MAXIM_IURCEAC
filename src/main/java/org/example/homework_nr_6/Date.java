package org.example.homework_nr_6;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if( day > 0 && day <=31){
        this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if( month> 0 && month <= 12){
        this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args){
       Date date = new Date(11, 11,2011);
        date.displayDate();
    }

}
