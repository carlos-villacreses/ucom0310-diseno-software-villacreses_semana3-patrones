package edu.uees.disenosoftware.appbuilder;

public class Reservationbuilder {
    String date;
    String tutor;
    String student;
    boolean schedule = true;
    String location = "";
    String link = "";
    String details = "";

    public Reservationbuilder(String date, String tutor, String student){
        this.date = date;
        this.tutor = tutor;
        this.student = student; 
    }

    public Reservationbuilder details(String details){
        this.details = details;
        return this;
    }

    public Reservationbuilder schedule(boolean schedule){
        this.schedule = schedule;
        return this;
    }

    public Reservationbuilder link(String link){
        this.link = link;
        return this;
    }

    public Reservationbuilder location(String location){
        this.location = location;
        return this;
    }

    public Reservation build(){

        if(student == null ||
             student.isBlank()){

            throw new IllegalArgumentException(
                    "Student is required");
        }

        if(tutor == null ||
             tutor.isBlank()){

            throw new IllegalArgumentException(
                    "Tutor is required");
        }

        if(date == null ||
             date.isBlank()){

            throw new IllegalArgumentException(
                    "Date is required");
        }

        return new Reservation(this);
    }

}
