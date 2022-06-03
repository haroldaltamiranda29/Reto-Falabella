package co.com.choucair.falabella.tasks;

import co.com.choucair.falabella.userinterfaces.FalabellaData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.jsoup.nodes.FormElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleccionar implements Task {

    private FalabellaData falabellaData;

    public static Seleccionar categorias() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep (5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.wasAbleTo(
                //Click.on(falabellaData.BUTTON_NO),
                Click.on(falabellaData.BUTTON_CATEGORIAS),
                Click.on(falabellaData.BUTTON_SUBCATEGORIAS),
                Click.on(falabellaData.BUTTON_MENU_SUBCATEGORIAS)
        );
    }
}
