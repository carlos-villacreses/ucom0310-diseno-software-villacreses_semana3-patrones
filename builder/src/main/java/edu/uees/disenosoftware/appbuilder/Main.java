package edu.uees.disenosoftware.appbuilder;

public class Main {
    public static void main(String[] args) {

        Reservation New01 =
                new Reservationbuilder(
                        "2026/09/20",
                        "Ing Karla Gonzalez",
                        "Carlos Villacreses")
                .link("https://www.microsoft.com/es-es/microsoft-teams/log-in")
                .location("Aura classroom")
                .details("First reservation for Software Design class")
                .build();

        Reservation New02 =
                new Reservationbuilder(
                        "2026/09/30",
                        "Phd Jaime Sayago Heredia",
                        "Carlos Mejia")
                .location("Plate classroom")
                .link("https://www.microsoft.com/es-es/microsoft-teams/log-in")
                .details("Second reservation for Software Design class")
                .build();

        System.out.println(New01);
        System.out.println(New02);
    }

}
