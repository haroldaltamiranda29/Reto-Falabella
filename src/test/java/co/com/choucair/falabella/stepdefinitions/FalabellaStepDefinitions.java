package co.com.choucair.falabella.stepdefinitions;

import co.com.choucair.falabella.models.FalabellaDatos;
import co.com.choucair.falabella.questions.Validacion;
import co.com.choucair.falabella.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class FalabellaStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que estoy en la pagina falabella$")
    public void queEstoyEnLaPaginaFalabella() throws Exception {
        OnStage.theActorCalled("Harold").wasAbleTo(AbrirPaginaFalabella.paginaPrincipal());
    }

    @Cuando("^selecciono una categoria y subcategoria$")
    public void seleccionoUnaCategoriaYSubcategoria() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.categorias());
    }

    @Y("^selecciono un producto de esa categoria$")
    public void seleccionoUnProductoDeEsaCategoria() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Escoger.producto());

    }

    @Y("^diligencio los formularios opciones de despacho$")
    public void diligencioLosFormulariosOpcionesDeDespacho(List<FalabellaDatos> falabellaDatos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.formularios(falabellaDatos));
    }

    @Y("^escojo el medio de pago tarjeta de credito$")
    public void escojoElMedioDePagoTarjetaDeCredito() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Elegir.medioDePago());
    }

    @Y("^diligencio el formulario de tarjeta$")
    public void diligencioElFormularioDeTarjeta(List<FalabellaDatos> falabellaDatos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Rellenar.datosTarjeta(falabellaDatos));
    }

    @Y("^diligencio el formulario de datos personales$")
    public void diligencioElFormularioDeDatosPersonales(List<FalabellaDatos> falabellaDatos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Completar.formularioDatosPersonales(falabellaDatos));
    }

    @Entonces("^valido que el mensaje modal tenga el siguiente valor \"([^\"]*)\"$")
    public void validoQueElMensajeModalTengaElSiguienteValor(String question) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validacion.mensaje(question)));
    }


}
