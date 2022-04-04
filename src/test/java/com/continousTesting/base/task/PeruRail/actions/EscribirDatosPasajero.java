package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscribirDatosPasajero implements Task {

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


    public synchronized static void EscribirDatosPasajero(String Nombres, String Apellidos, String FechaNacimiento, String Nacionalidad, String TipoDocumento, String NumeroDocumento, String Sexo, String Telefono, String Correo, String ConfirmacionCorreo) {
        EscribirDatosPasajero.Nombres = Nombres;
        EscribirDatosPasajero.Apellidos = Apellidos;
        EscribirDatosPasajero.FechaNacimiento = FechaNacimiento;
        EscribirDatosPasajero.Nacionalidad = Nacionalidad;
        EscribirDatosPasajero.TipoDocumento = TipoDocumento;
        EscribirDatosPasajero.NumeroDocumento = NumeroDocumento;
        EscribirDatosPasajero.Sexo = Sexo;
        EscribirDatosPasajero.Telefono = Telefono;
        EscribirDatosPasajero.Correo = Correo;
        EscribirDatosPasajero.ConfirmacionCorreo = ConfirmacionCorreo;

    }

    public EscribirDatosPasajero(String Nombres, String Apellidos, String FechaNacimiento, String Nacionalidad, String TipoDocumento, String NumeroDocumento, String Sexo, String Telefono, String Correo, String ConfirmacionCorreo) {
        EscribirDatosPasajero(Nombres,Apellidos,FechaNacimiento,Nacionalidad,TipoDocumento,NumeroDocumento,Sexo, Telefono,Correo,ConfirmacionCorreo);

    }

    public static EscribirDatosPasajero correctly(String Nombres, String Apellidos, String FechaNacimiento, String Nacionalidad, String TipoDocumento, String NumeroDocumento, String Sexo, String Telefono, String Correo, String ConfirmacionCorreo) {

        return instrumented(EscribirDatosPasajero.class, Nombres,Apellidos,FechaNacimiento,Nacionalidad,TipoDocumento,NumeroDocumento,Sexo, Telefono,Correo,ConfirmacionCorreo);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);


            actor.attemptsTo(

                    Enter.theValue(Nombres).into(PeruRailPage.txtNombres.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Enter.theValue(Apellidos).into(PeruRailPage.txtApellidos.waitingForNoMoreThan(Duration.ofSeconds(10))),

                    Click.on(PeruRailPage.selectFechaNacimientoPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectFechaNacimientoMesPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectFechaNacimientoMes(FechaNacimiento.split("-")[1].trim()).waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectFechaNacimientoAnioPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectFechaNacimientoAnio(FechaNacimiento.split("-")[2].trim()).waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectFechaNacimientoDia(FechaNacimiento.split("-")[0].trim()).waitingForNoMoreThan(Duration.ofSeconds(10))),

                    Click.on(PeruRailPage.selectNacionalidadPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectNacionalidad(Nacionalidad).waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectTipoDocumentoPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectTipoDocumento(TipoDocumento).waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Enter.theValue(NumeroDocumento).into(PeruRailPage.txtNumeroDocumento.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectSexoPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectSexo(Sexo).waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Enter.theValue(Telefono).into(PeruRailPage.txtTelefono.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Enter.theValue(Correo).into(PeruRailPage.txtCorreo.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Enter.theValue(ConfirmacionCorreo).into(PeruRailPage.txtConfirmacionCorreo.waitingForNoMoreThan(Duration.ofSeconds(10)))


            );





    }



}
