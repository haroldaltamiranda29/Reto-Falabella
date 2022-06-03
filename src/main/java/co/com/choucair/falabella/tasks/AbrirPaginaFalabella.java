package co.com.choucair.falabella.tasks;

import co.com.choucair.falabella.userinterfaces.FalabellaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaFalabella implements Task {

    private FalabellaPage falabellaPage;

    public static AbrirPaginaFalabella paginaPrincipal() {
        return Tasks.instrumented(AbrirPaginaFalabella.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(falabellaPage)
        );
    }
}
