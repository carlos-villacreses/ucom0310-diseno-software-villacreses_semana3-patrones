package edu.uees.disenosoftware.app;

import edu.uees.disenosoftware.notificacion.CreadorNotificadorSimple;
import edu.uees.disenosoftware.notificacion.ServicioNotificacion;

public class Main {

    public static void main(String[] args) {

        CreadorNotificadorSimple creador =
            new CreadorNotificadorSimple();

        ServicioNotificacion servicio =
            new ServicioNotificacion(creador);

        System.out.println("=== Sistema de gestión de tutorías ===");
        System.out.println("Versión inicial: creación mediante if/else");
        System.out.println();

        servicio.notificar(
            "EMAIL",
            "estudiante@uees.edu.ec",
            "Su tutoría fue confirmada."
        );

        servicio.notificar(
            "PUSH",
            "usuario-001",
            "Su tutoría comienza en 30 minutos."
        );

        servicio.notificar(
            "SMS",
            "+593999999999",
            "Tutoría reprogramada."
        );

        System.out.println();
        System.out.println("Analiza: ¿qué pasa si mañana agregamos TEAMS o WHATSAPP?");
    }
}
