package co.com.choucair.falabella.tasks;

import co.com.choucair.falabella.userinterfaces.FalabellaData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Elegir implements Task {

    private FalabellaData falabellaData;
    public static Elegir medioDePago() {
        return Tasks.instrumented(Elegir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(falabellaData.OTRAS_TARJETAS_CREDITO),
                Click.on(falabellaData.MEDIO_SELECCIONADO)
        );
    }
}
