README.md
# Diseño de Software - Semana 3 - Patrones
## Información general
- **Universidad:** Universidad Espíritu Santo
- **Carrera:** Computación
- **Asignatura:** Diseño de Software
- **Código:** UCOM0310
- **Periodo:** PEL 4 - 2026
- **Estudiante:** CARLOS VILLACRESES
- **Docente:** Ph.D. Jaime Paul Sayago Heredia

## Descripción
Sistema de gestion de tutorias aplicando Diseño de software.

## Objetivos
- Uso de patrón Factory Method.
- Uso de patrón Builder.

## Tecnologías
- Java 21
- Apache Maven 3.9.x
- Git y GitHub
- JUnit 5

Diseño de Software · UCOM0310 · PEL 4-2026 · UEES Online

- Spring Boot, cuando corresponda
## Requisitos previos
- JDK 21 instalado.
- Maven disponible en PATH.
- Git configurado.
## Instalación
```bash
git clone https://github.com/carlos-villacreses/ucom0310-diseno-software-villacreses_semana3-patrones.git
cd ucom0310-diseno-software-villacreses_semana3patrones
mvn clean test
```
## Ejecución
```bash
mvn package
java -jar target/NOMBRE-DEL-ARCHIVO.jar
```
Adapte los comandos de ejecución a la estructura real del proyecto.
## Estructura del proyecto
```text
.
├── base
│   ├── docs
│   │   └── modelo-inicial.puml
│   ├── pom.xml
│   ├── README.md
│   ├── src
│   │   ├── main
│   │   │   └── java
│   │   │       └── edu
│   │   │           └── uees
│   │   │               └── disenosoftware
│   │   │                   ├── app
│   │   │                   │   └── Main.java
│   │   │                   └── notificacion
│   │   │                       ├── CreadorNotificadorSimple.java
│   │   │                       ├── NotificadorEmail.java
│   │   │                       ├── Notificador.java
│   │   │                       ├── NotificadorPush.java
│   │   │                       ├── NotificadorSMS.java
│   │   │                       └── ServicioNotificacion.java
│   │   └── test
│   │       └── java
│   │           └── edu
│   │               └── uees
│   │                   └── disenosoftware
│   │                       └── notificacion
│   │                           └── CreadorNotificadorSimpleTest.java
│   └── target
│       ├── classes
│       │   └── edu
│       │       └── uees
│       │           └── disenosoftware
│       │               ├── app
│       │               │   └── Main.class
│       │               └── notificacion
│       │                   ├── CreadorNotificadorSimple.class
│       │                   ├── Notificador.class
│       │                   ├── NotificadorEmail.class
│       │                   ├── NotificadorPush.class
│       │                   ├── NotificadorSMS.class
│       │                   └── ServicioNotificacion.class
│       └── test-classes
│           └── edu
│               └── uees
│                   └── disenosoftware
│                       └── notificacion
│                           └── CreadorNotificadorSimpleTest.class
├── builder
│   └── src
│       └── main
│           └── java
│               └── edu
│                   └── uees
│                       └── disenosoftware
│                           └── appbuilder
│                               ├── Main.java
│                               ├── Reservationbuilder.java
│                               └── Reservation.java
├── factorymethod
│   └── src
│       └── main
│           └── java
│               └── edu
│                   └── uees
│                       └── disenosoftware
│                           ├── app
│                           │   └── Main.java
│                           └── notificacion
│                               ├── EmailCreator.java
│                               ├── NotificadorCreator.java
│                               ├── NotificadorEmail.java
│                               ├── Notificador.java
│                               ├── NotificadorPush.java
│                               ├── NotificadorSMS.java
│                               ├── NotificarTeams.java
│                               ├── PushCreator.java
│                               └── SmsCreator.java
└── README.md

```
## Funcionalidades
- Implementación de patrón FACTORY METHOD.
- Implementación de patron BUILDER.
## Pruebas
Para ejecutar las pruebas:
```bash
mvn clean test
```
## Control de versiones
El proyecto utiliza la rama `main`. Las funcionalidades se desarrollan en ramas específicas y se integran
mediante revisión.

Diseño de Software · UCOM0310 · PEL 4-2026 · UEES Online

## Evidencias


## Uso de inteligencia artificial
No se usó IA.

## Autor
CARLOS VILLACRESES - CARLOS.VILLACRESES@UEES.EDU.EC
