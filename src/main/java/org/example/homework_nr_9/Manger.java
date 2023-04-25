package org.example.homework_nr_9;

public class Manger extends Employee implements AttendInterview , AttendTraining {

    int monthlyReport;

    public Manger(String name, String surname, int age, int workingHours, double salary, int monthlyReport) {
        super(name, surname, age, workingHours, salary);
        this.monthlyReport = monthlyReport;
    }

    public int getMonthlyReport() {
        return monthlyReport;
    }

    public void setMonthlyReport(int monthlyReport) {
        this.monthlyReport = monthlyReport;
    }

    @Override
    public void conductInterview() {
        System.out.println("Manager " +getName()+ " " + getSurname() +  " is conducting the interview...");
    }

    @Override
    public void attendTraining() {
        System.out.println("Manager " +getName()+ " " + getSurname() + " is attending the training...");
    }
}
