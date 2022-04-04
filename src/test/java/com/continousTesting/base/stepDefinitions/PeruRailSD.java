package com.continousTesting.base.stepDefinitions;

import com.continousTesting.base.questions.PeruRail.DatosResumenDiaSalida;
import com.continousTesting.base.questions.PeruRail.DatosResumenImporteSalida;
import com.continousTesting.base.questions.PeruRail.DatosResumenPersonas;
import com.continousTesting.base.questions.PeruRail.DatosResumenTren;
import com.continousTesting.base.task.PeruRail.NavigateToPeruRail;
import com.continousTesting.base.task.PeruRail.actions.*;
import com.continousTesting.base.task.PeruRail.actions.SelectTipoCabinayCantidad;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;


import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class PeruRailSD {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("Que {actor} inicializa la pagina de Peru Rail")
    public void queAlonsoInicializaLaPaginaDePeruRail(Actor actor) {
        actor.wasAbleTo(NavigateToPeruRail.PeruRailWebPage());

    }

    @When("Selecciona los datos de rutas y servicios de tren")
    public void seleccionaLosDatosDeRutasYServiciosDeTren(List<Map<String, String>> reservacion) {
        theActorInTheSpotlight().attemptsTo(
                SelectTipoCamino.correctly(reservacion.get(0).get("TipoCamino")),
                SelectDestino.correctly(reservacion.get(0).get("Destino")),
                SelectRuta.correctly(reservacion.get(0).get("Ruta")),
                SelectTren.correctly(reservacion.get(0).get("Tren")),
                SelectPasajeros.correctly(reservacion.get(0).get("PasajerosMenores"), reservacion.get(0).get("PasajerosMayores")),
                SelectFechaIda.correctly(reservacion.get(0).get("FechaIda")),
                SelectFechaRetorno.correctly(reservacion.get(0).get("FechaRetorno"))

        );



    }


    @And("Busca la disponibilidad del tren")
    public void buscaLaDisponibilidadDelTren() {
                theActorInTheSpotlight().attemptsTo(SelectBuscaTuTren.correctly());


    }

    @And("Selecciono el tipo de cabina: {string} y CantidadCabinas: {string}")
    public void seleccionoElTipoDeCabinaYCantidadCabinas(String tipoCabina, String cantidadCabina) {
        theActorInTheSpotlight().attemptsTo(
                SelectTipoCabinayCantidad.correctly(tipoCabina,cantidadCabina)

        );

    }

    @And("Seleccionar continuar")
    public void seleccionarContinuar() {
        theActorInTheSpotlight().attemptsTo(
                SelectBotonContinuar.correctly()

        );
    }

    @And("Ingresar datos de primer pasajero: {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void ingresarDatosDePrimerPasajero(String Nombres, String Apellidos, String FechaNacimiento, String Nacionalidad, String TipoDocumento, String NumeroDocumento, String Sexo, String Telefono, String Correo, String ConfirmacionCorreo) {

        theActorInTheSpotlight().attemptsTo(
                EscribirDatosPasajero.correctly(Nombres,Apellidos,FechaNacimiento,Nacionalidad,TipoDocumento,NumeroDocumento,Sexo, Telefono,Correo,ConfirmacionCorreo)

        );



    }

    @And("Continuo al pago de pasajes")
    public void continuoAlPagoDePasajes() {
        theActorInTheSpotlight().attemptsTo(
                SelectContinuoAlPago.correctly()

        );

    }

    @Then("Verifico datos origen en carrito resumen: {string} {string} {string} {string}")
    public void verificoDatosOrigenEnCarritoResumen(String tren, String dia, String personas, String importe) {

        theActorInTheSpotlight().attemptsTo(
                SelectResumenCompra.correctly()
        );

        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(DatosResumenTren.getText(), equalTo(tren)),
                GivenWhenThen.seeThat(DatosResumenDiaSalida.getText(), equalTo(dia)),
                GivenWhenThen.seeThat(DatosResumenPersonas.getText(), equalTo(personas)),
                GivenWhenThen.seeThat(DatosResumenImporteSalida.getText(), equalTo(importe))

        );
    }

    @And("Selecciono el tipo de tren de ida: {string} y tren de regreso {string}")
    public void seleccionoElTipoDeTrenDeIdaYTrenDeRegreso(String trenIda, String trenRegreso) {

        theActorInTheSpotlight().attemptsTo(
                SelectTrenIdaRegreso.correctly(trenIda,trenRegreso)
        );

    }

    @And("Seleccionar continuar verde")
    public void seleccionarContinuarVerde() {

        theActorInTheSpotlight().attemptsTo(
                SelectBotonContinuarVerde.correctly()
        );


    }

    @And("Ingresar datos de primer pasajero dos: {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void ingresarDatosDePrimerPasajero2(String Nombres, String Apellidos, String FechaNacimiento, String Nacionalidad, String TipoDocumento, String NumeroDocumento, String Sexo, String Telefono, String Correo, String ConfirmacionCorreo) {

        theActorInTheSpotlight().attemptsTo(
                EscribirDatosPasajero2.correctly(Nombres,Apellidos,FechaNacimiento,Nacionalidad,TipoDocumento,NumeroDocumento,Sexo, Telefono,Correo,ConfirmacionCorreo)

        );


    }

    @And("Continuo a enviar pago de pasajes")
    public void continuoAEnviarPagoDePasajes() {

        theActorInTheSpotlight().attemptsTo(
                SelectBotonContinuarVerde2.correctly()
        );

    }

    @Then("Verifico datos origen ida en carrito resumen: {string} {string} {string} {string}")
    public void verificoDatosOrigenIdaEnCarritoResumen(String tren, String dia, String personas, String importe) {

      //  theActorInTheSpotlight().attemptsTo(
      //          SelectResumenCompra.correctly()
      //  );


        Assert.assertEquals(getDriver().findElement(By.xpath("/html/body/section/section[1]/div/div[2]/div[3]/div[2]/div[2]")).getText(), tren);
        Assert.assertEquals(getDriver().findElement(By.xpath("/html/body/section/section[1]/div/div[2]/div[3]/div[1]/div[2]")).getText(), dia);
        Assert.assertEquals(getDriver().findElement(By.xpath("/html/body/section/section[1]/div/div[2]/div[4]/div[1]")).getText(), personas);
        Assert.assertEquals(getDriver().findElement(By.xpath("/html/body/section/section[1]/div/div[4]/div[1]/div[1]/span[2]")).getText(), importe);


    }
}
