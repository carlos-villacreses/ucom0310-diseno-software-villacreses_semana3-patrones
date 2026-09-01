package edu.uees.disenosoftware.app;

import edu.uees.disenosoftware.notificacion.EmailCreator;
import edu.uees.disenosoftware.notificacion.NotificadorCreator;
import edu.uees.disenosoftware.notificacion.NotificadorSMS;
import edu.uees.disenosoftware.notificacion.PushCreator;
import edu.uees.disenosoftware.notificacion.ServicioNotificacion;
import edu.uees.disenosoftware.notificacion.SmsCreator;

public class Main {
    public static void main(String[] args) {
    	 System.out.println("=== Factory Method ===");
    	 NotificadorCreator email = new EmailCreator();
    	 	email.notificar("estudiantes uees", "Tutoría confirmada");
    	
    	 NotificadorCreator push = new PushCreator();
    	 	push.notificar("usuario 01", "Tutoria empieza en 30 minutos");
    	 	
    	 NotificadorCreator sms = new SmsCreator();
    	 	sms.notificar("5938887373", "Tutoria reagendada");
    }
}
