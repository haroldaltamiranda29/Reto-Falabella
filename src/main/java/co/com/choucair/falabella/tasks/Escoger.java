package co.com.choucair.falabella.tasks;

import co.com.choucair.falabella.userinterfaces.FalabellaData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Escoger implements Task {

    private FalabellaData falabellaData;
    public static Escoger producto() {
        return Tasks.instrumented(Escoger.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep (4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.wasAbleTo(
              //  WaitUntil.the(ChoucairLoginPage.LOGIN_BUTTON, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(falabellaData.SELECCIONAR_PRODUCTO),
                Click.on(falabellaData.BUTON_AGREGAR_A_LA_BOLSA),
                Click.on(falabellaData.BUTON_BOLSA_DE_COMPRA),
                Click.on(falabellaData.BUTON_IR_A_COMPRAR)
        );

    }
}
