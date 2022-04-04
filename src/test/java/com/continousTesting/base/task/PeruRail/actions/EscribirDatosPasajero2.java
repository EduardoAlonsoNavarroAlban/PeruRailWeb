package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscribirDatosPasajero2 implements Task {

    private static String Nombres;
    private static String Apellidos;
    private static String FechaNacimiento;
    private static String Nacionalidad;
    private static String TipoDocumento;
    private static String NumeroDocumento;
    private static String Sexo;
    private static String Telefono;
    private static String Correo;
    private static String ConfirmacionCorreo;


    public synchronized static void EscribirDatosPasajero2(String Nombres, String Apellidos, String FechaNacimiento, String Nacionalidad, String TipoDocumento, String NumeroDocumento, String Sexo, String Telefono, String Correo, String ConfirmacionCorreo) {
        EscribirDatosPasajero2.Nombres = Nombres;
        EscribirDatosPasajero2.Apellidos = Apellidos;
        EscribirDatosPasajero2.FechaNacimiento = FechaNacimiento;
        EscribirDatosPasajero2.Nacionalidad = Nacionalidad;
        EscribirDatosPasajero2.TipoDocumento = TipoDocumento;
        EscribirDatosPasajero2.NumeroDocumento = NumeroDocumento;
        EscribirDatosPasajero2.Sexo = Sexo;
        EscribirDatosPasajero2.Telefono = Telefono;
        EscribirDatosPasajero2.Correo = Correo;
        EscribirDatosPasajero2.ConfirmacionCorreo = ConfirmacionCorreo;

    }

    public EscribirDatosPasajero2(String Nombres, String Apellidos, String FechaNacimiento, String Nacionalidad, String TipoDocumento, String NumeroDocumento, String Sexo, String Telefono, String Correo, String ConfirmacionCorreo) {
        EscribirDatosPasajero2(Nombres,Apellidos,FechaNacimiento,Nacionalidad,TipoDocumento,NumeroDocumento,Sexo, Telefono,Correo,ConfirmacionCorreo);

    }

    public static EscribirDatosPasajero2 correctly(String Nombres, String Apellidos, String FechaNacimiento, String Nacionalidad, String TipoDocumento, String NumeroDocumento, String Sexo, String Telefono, String Correo, String ConfirmacionCorreo) {

        return instrumented(EscribirDatosPasajero2.class, Nombres,Apellidos,FechaNacimiento,Nacionalidad,TipoDocumento,NumeroDocumento,Sexo, Telefono,Correo,ConfirmacionCorreo);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);


        actor.attemptsTo(

                Enter.theValue(Nombres).into(PeruRailPage.txtNombres2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(Apellidos).into(PeruRailPage.txtApellidos2.waitingForNoMoreThan(Duration.ofSeconds(10))),

                Click.on(PeruRailPage.selectFechaNacimientoPrev2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectFechaNacimientoMesPrev2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectFechaNacimientoMes2(FechaNacimiento.split("-")[1].trim()).waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectFechaNacimientoAnioPrev2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectFechaNacimientoAnio2(FechaNacimiento.split("-")[2].trim()).waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectFechaNacimientoDia2(FechaNacimiento.split("-")[0].trim()).waitingForNoMoreThan(Duration.ofSeconds(10))),

                Click.on(PeruRailPage.selectNacionalidadPrev2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectNacionalidad2(Nacionalidad).waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectTipoDocumentoPrev2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectTipoDocumento2(TipoDocumento).waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(NumeroDocumento).into(PeruRailPage.txtNumeroDocumento2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectSexoPrev2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectSexo2(Sexo).waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(Telefono).into(PeruRailPage.txtTelefono2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(Correo).into(PeruRailPage.txtCorreo2.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(ConfirmacionCorreo).into(PeruRailPage.txtConfirmacionCorreo2.waitingForNoMoreThan(Duration.ofSeconds(10)))


        );





    }



}
