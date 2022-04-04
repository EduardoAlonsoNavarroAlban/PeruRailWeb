package com.continousTesting.base.page;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.ByAction;
import net.serenitybdd.screenplay.targets.ByTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.perurail.com/es/")
public class PeruRailPage extends PageObject {



    public static final Target selectDismiunsionAdulto = Target.the("Disminusion pasajes adulto")
            .located(By.xpath("//a[@id='adultsDism']"));


    public static final Target clicEquisEdad = Target.the("Disminusion pasajes adulto")
            .located(By.xpath("/html/body/div[1]/div[3]/form/div/div[3]/div/a"));

    public static Target selTipoCamino(String tipoCamino) {
       return Target.the("Tipo de camino Ida o Ida y Vuelta")
         .located(By.xpath("//*[@id=\"radioset\"]/div[@class='input-radio']/label[text()=" + tipoCamino + "]"));
    }



    public static final Target selectDestinoPrev = Target.the("DestinoPrev")
            .located(By.xpath("//select[@id='destinoSelect']"));

    public static Target selectDestino(String destino) {

        return Target.the("Destino")
                .located(By.xpath("//select[@id='destinoSelect']/option[contains(text(),"+destino+")]"));
    }


    public static final Target selectRutaPrev = Target.the("Ruta")
            .located(By.xpath("//select[@id='rutaSelect']"));

    public static Target selectRuta(String ruta) {
        return Target.the("Ruta")
                .located(By.xpath("//select[@id='rutaSelect']/option[contains(text(),"+ruta+")]"));
    }


    public static final Target selectTrenPrev = Target.the("Tren")
            .located(By.xpath("//select[@id='cbTrenSelect']"));

    public static Target selectTren(String tren) {
        return Target.the("Tren")
                .located(By.xpath("//select[@id='cbTrenSelect']/option[contains(text(),"+tren+")]"));

    }


    public static final Target selectEdadPrev = Target.the("Selector de Edad")
            .located(By.xpath("/html/body/div[1]/div[3]/form/div/div[3]/input[3]"));



    public static final Target txtMenoresEdad = Target.the("Cantidad Menores de Edad")
            .located(By.xpath("//input[@id='childrenSelect']"));


    public static final Target txtMayoresEdad = Target.the("Cantidad Mayores de Edad")
            .located(By.xpath("//input[@id='adultsSelect']"));




    public static final Target selectFechaIdaPrev = Target.the("Selector Fecha de Ida")
            .located(By.xpath("//input[@id='salida']"));

    public static Target selectFechaIda(String fechaIda) {
        return Target.the("Fecha de Ida")
                .located(By.xpath("//body/div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']//a[text()="+fechaIda+"]"));
    }




    public static final Target selectFechaRetornoPrev = Target.the("Selector Fecha de Retorno")
            .located(By.xpath("//input[@id='regreso']"));


    public static Target selectFechaRetorno(String fechaRetorno) {
        return Target.the("Fecha de Retorno")
                .located(By.xpath("//body/div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']//a[text()="+fechaRetorno+"]"));
    }



    public static final Target btnBuscaTuTren = Target.the("Boton busca tu tren")
            .located(By.xpath("//button[@id='btn_search']"));


    public static Target selectCantidadCabinaPrev(String tipoCabina) {
        return Target.the("Previo Cantidad Cabina")
                .located(By.xpath("//form[@id='frm_viajes_bae']//div[@class='box-cabina']/div[@class='detalle-cabina']/h3[text()='"+tipoCabina+"']/ancestor::div[@class='box-cabina']/div[@class='calculo-cabina']/div/div/select"));


    }

    public static Target selectCantidadCabina(String tipoCabina,String cantidadCabinas) {
        return Target.the("Cantidad Cabinas")
                .located(By.xpath("//form[@id='frm_viajes_bae']//div[@class='box-cabina']/div[@class='detalle-cabina']/h3[text()='"+tipoCabina+"']/ancestor::div[@class='box-cabina']/div[@class='calculo-cabina']/div/div/select/option[@value='"+cantidadCabinas+"']"));
    }


    public static final Target btnContinuar = Target.the("Boton continuar para ingresar datos")
            .located(By.xpath("//input[@id='continuar_bae']"));




    public static final Target txtNombres = Target.the("Nombres del pasajero")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/input[@placeholder='Nombre']"));

    public static final Target txtApellidos = Target.the("Apellidos del pasajero")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/input[@placeholder='Apellidos']"));


    public static final Target selectFechaNacimientoPrev = Target.the("Fecha de Nacimiento del pasajero")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/input[@placeholder='Fecha de nacimiento']"));


    public static final Target selectNacionalidadPrev = Target.the("Previo Nacionalidad")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/select/option[text()='Nacionalidad']"));


    public static Target selectNacionalidad(String nacionalidad) {
        return Target.the("Nacionalidad del pasajero")
                .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/select/option[text()='"+nacionalidad+"']"));
    }


    public static final Target selectTipoDocumentoPrev = Target.the("Previo Tipo Documento")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/select/option[text()='Documento']"));


    public static Target selectTipoDocumento(String tipoDocumento) {
        return Target.the("Nacionalidad del pasajero")
                .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/select/option[text()='"+tipoDocumento+"']"));
    }



    public static final Target txtNumeroDocumento = Target.the("Numero de Documento")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/input[@placeholder='Número de documento']"));


    public static final Target selectSexoPrev = Target.the("Prev Sexo")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/select/option[text()='Sexo']"));


    public static Target selectSexo(String sexo) {
        return Target.the("Sexo")
                .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/select/option[text()='"+sexo+"']"));
    }

    public static final Target txtTelefono = Target.the("Telefono")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/div[@class='intl-tel-input allow-dropdown']/input[@placeholder='Teléfono']"));



    public static final Target txtCorreo = Target.the("Correo")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/input[@placeholder='Correo electrónico']"));


    public static final Target txtConfirmacionCorreo = Target.the("Confirmacion Correo")
            .located(By.xpath("//div[@class='content-pasajero oculto']/div[contains(text(),'PASAJERO 1')]/parent::*/div[@class='accordion-content-item']/input[@placeholder='Confirmar correo']"));


    public static final Target btnContinuarAlPago = Target.the("Boton continuar al pago")
            .located(By.xpath("//button[@id='btnContinuarPas']"));


    public static final Target selectFechaNacimientoMesPrev = Target.the("Seleccion Previo Mes Nacimiento")
            .located(By.xpath("//body/div[@id='ui-datepicker-div']/div/div/select[@class='ui-datepicker-month']"));


    public static Target selectFechaNacimientoMes(String mes) {
        return Target.the("Mes Nacimiento")
                .located(By.xpath("//body/div[@id='ui-datepicker-div']/div/div/select[@class='ui-datepicker-month']/option[text()='"+mes+"']"));
    }


    public static final Target selectFechaNacimientoAnioPrev = Target.the("Seleccion Previo Anio Nacimiento")
            .located(By.xpath("//body/div[@id='ui-datepicker-div']/div/div/select[@class='ui-datepicker-year']"));


    public static Target selectFechaNacimientoAnio(String anio) {
        return Target.the("Anio Nacimiento")
                .located(By.xpath("//body/div[@id='ui-datepicker-div']/div/div/select[@class='ui-datepicker-year']/option[text()='"+anio+"']"));
    }

    public static Target selectFechaNacimientoDia(String dia) {
        return Target.the("Dia Nacimiento")
                .located(By.xpath("//body/div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='"+dia+"']"));
    }


    public static final Target lblResumenCompra = Target.the("Seleccion label resumen compra")
            .located(By.xpath("//body/section[@id='wrapper']/section[@id='compra']/a/img"));



    public static final Target labelResumenTren = Target.the("Label Resumen Tren escogido")
            .located(By.xpath("//body/section[@id='wrapper']/section[@id='compra']/div/div[@class='detalle-compra']/div[@class='detalle']/div[@class='row']/div[@class='firts' and text()='Tren:']/following-sibling::div"));


    public static final Target labelResumenDiaSalida = Target.the("Label Resumen Dia Salida")
            .located(By.xpath("//body/section[@id='wrapper']/section[@id='compra']/div/div[@class='detalle-compra']/div[@class='detalle']/div[@class='row']/div[@class='firts' and text()='Fecha de Salida:']/following-sibling::div"));


    public static final Target labelResumenPersonas = Target.the("Label Resumen Personas")
            .located(By.xpath("//body/section[@id='wrapper']/section[@id='compra']/div/div[@class='detalle-compra']/div[@class='pasajeros']/div/span[@class='text1']"));

    public static final Target labelResumenImporteSalida = Target.the("Label Resumen Importe Salida")
            .located(By.xpath("//body/section[@id='wrapper']/section[@id='compra']/div/div[@class='detalle-compra']/div[@class='pasajeros']/div/span[@class='text1']/following-sibling::span"));


    public static Target selectTrenIda(String trenIda) {
        return Target.the("Tren Ida")
                .located(By.xpath("//body/section[@id='wrapper']/section[@id='content']/div/div/div/div/div/div/div/div/div[contains(text(),'"+trenIda+"')]/ancestor::div[@indtramo='IDA']"));
    }

    public static Target selectTrenRegreso(String trenRegreso) {
        return Target.the("Tren Regreso")
                .located(By.xpath("//body/section[@id='wrapper']/section[@id='content']/div/div/div/div/div/div/div/div[contains(text(),'"+trenRegreso+"')]/ancestor::div[@indtramo='RET']"));
    }

    public static final Target btnContinuarVerde = Target.the("Boton continuar verde")
            .located(By.xpath("//body/section[@id='wrapper']/section[@id='content']/div/form/div/div/input[@class='btn  btn-continuar']"));






    //-----------------------------------------------------------------------------

    public static final Target txtNombres2 = Target.the("Nombres pasajero")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/input[1]"));

    public static final Target txtApellidos2 = Target.the("Apellidos pasajero")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/input[2]"));

    public static final Target selectFechaNacimientoPrev2 = Target.the("Previo Fecha Nacimiento")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/input[3]"));

    public static final Target selectFechaNacimientoMesPrev2 = Target.the("Previo Mes Nacimiento")
            .located(By.xpath("/html/body/section/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[1]/select"));

    public static final Target selectFechaNacimientoAnioPrev2 = Target.the("Previo Anio Nacimiento")
            .located(By.xpath("/html/body/section/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/select"));

    public static final Target selectNacionalidadPrev2 = Target.the("Previo Nacionalidad")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/select[1]"));

    public static final Target selectTipoDocumentoPrev2 = Target.the("Previo Tipo Documento")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/select[2]"));

    public static final Target txtNumeroDocumento2 = Target.the("Numero documento")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/input[4]"));

    public static final Target selectSexoPrev2 = Target.the("Previo Seleccion Sexo")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/select[3]"));

    public static final Target txtTelefono2 = Target.the("Numero de telefono")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/div[1]/input"));

    public static final Target txtCorreo2 = Target.the("Correo")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/div[2]/input[1]"));

    public static final Target txtConfirmacionCorreo2 = Target.the("Confirmacion Correo")
            .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/div[2]/input[2]"));



    public static Target selectFechaNacimientoMes2(String mes) {
        return Target.the("Mes nacimiento")
                .located(By.xpath("//select[@id='calendario_mes']/option[text()='"+mes+"']"));
    }

    public static Target selectFechaNacimientoAnio2(String anio) {
        return Target.the("Anio nacimiento")
                .located(By.xpath("//select[@id='calendario_anio']/option[text()='"+anio+"']"));
    }

    public static Target selectFechaNacimientoDia2(String dia) {
        return Target.the("Dia nacimiento")
                .located(By.xpath("//table[@id='tlb_calendario']/tbody/tr/td/a[text()='"+dia+"']"));
    }

    public static Target selectNacionalidad2(String nacionalidad) {
        return Target.the("Nacionalidad")
                .located(By.xpath("//*[@id=\"formPasajero1-idPais\"]/option[text()='"+nacionalidad+"']"));
    }

    public static Target selectTipoDocumento2(String tipoDocumento) {
        return Target.the("Tipo Documento")
                .located(By.xpath("/html/body/section/section[2]/div/form/div[1]/div[2]/select[2]/option[text()='"+tipoDocumento+"']"));
    }

    public static Target selectSexo2(String sexo) {
        return Target.the("Sexo")
                .located(By.xpath("//*[@id='formPasajero1-idSexo']/option[text()='"+sexo+"']"));

    }

    public static final Target btnContinuarVerde2 = Target.the("Boton verde continuar")
            .located(By.xpath("//input[@id='enviarPago']"));



}
