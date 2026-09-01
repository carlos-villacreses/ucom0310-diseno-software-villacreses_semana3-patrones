package edu.uees.disenosoftware.appbuilder;

public class Reservation {
    private String reservation_date;
    private String reservation_tutor;
    private String reservation_student;
    private boolean reservation_schedule;
    private String reservation_location;
    private String reservation_link;
    private String reservation_details;

    Reservation(Reservationbuilder builder){
        this.reservation_date = builder.date;
        this.reservation_tutor = builder.tutor;
        this.reservation_student = builder.student;
        this.reservation_schedule = builder.schedule;
        this.reservation_location = builder.location;
        this.reservation_link = builder.link;
        this.reservation_details = builder.details;
    }

    @Override
    public String toString() {
        return
            "Reservation details:" +
            "\n Location: " + reservation_location +
            "\n Schedule: " + reservation_schedule +
            "\n Date: " + reservation_date +
            "\n Tutor: " + reservation_tutor +
            "\n Student: " + reservation_student +
            "\n Details: " + reservation_details +
            "\n Link: " + reservation_link +
            "\n";
    }
}
