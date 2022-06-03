package co.com.choucair.falabella.tasks;

import co.com.choucair.falabella.models.FalabellaDatos;
import co.com.choucair.falabella.userinterfaces.FalabellaData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Rellenar implements Task {

    public Rellenar(List<FalabellaDatos> falabellaDatos) {
        this.falabellaDatos = falabellaDatos;
    }

    List<FalabellaDatos> falabellaDatos;

    private FalabellaData falabellaData;
    public static Rellenar datosTarjeta(List<FalabellaDatos> falabellaDatos) {

        return Tasks.instrumented(Rellenar.class, falabellaDatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(falabellaDatos.get(0).getNombreTarjeta()).into(falabellaData.NOMRE_TARJETA),
                Enter.theValue(falabellaDatos.get(0).getNumeroTarjeta()).into(falabellaData.NUMERO_TARJETA),
                Enter.theValue(falabellaDatos.get(0).getCodigoCVV()).into(falabellaData.CVV_TARJETA),
                Click.on(falabellaData.MES),
                Click.on(falabellaData.SELECCIONO_MES),
                Click.on(falabellaData.ANIO),
                Click.on(falabellaData.SELECCIONO_ANIO),
                Click.on(falabellaData.BOTON_USAR_ESTA_TARJETA)
        );
    }
}
