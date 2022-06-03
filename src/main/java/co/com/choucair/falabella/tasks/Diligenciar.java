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

public class Diligenciar implements Task {

    private FalabellaData falabellaData;

    public Diligenciar(List<FalabellaDatos> falabellaDatos) {
        this.falabellaDatos = falabellaDatos;
    }

    List<FalabellaDatos> falabellaDatos;

    public static Diligenciar formularios(List<FalabellaDatos> falabellaDatos) {

        return Tasks.instrumented(Diligenciar.class,falabellaDatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(falabellaData.BUTON_REGION),
                Click.on(falabellaData.BUTON_DEPARTAMENTO),
                Click.on(falabellaData.BUTON_CIUDAD),
                Click.on(falabellaData.BOTON_SELECCIONAR_CIUDAD),
                Click.on(falabellaData.BOTON_COMUNA),
                Click.on(falabellaData.BOTON_SELECCIONAR_COMUNA),
                Click.on(falabellaData.BOTON_CONTINUAR),
                Enter.theValue(falabellaDatos.get(0).getDireccion()).into(falabellaData.DIRECCION),
                Enter.theValue(falabellaDatos.get(0).getBarrio()).into(falabellaData.APARTAMENTO),
                Click.on(falabellaData.BOTON_INGRESAR_DIRECCION),
                Click.on(falabellaData.CONTINUAR)
        );

    }
}
