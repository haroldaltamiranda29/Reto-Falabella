package co.com.choucair.falabella.tasks;

import co.com.choucair.falabella.models.FalabellaDatos;
import co.com.choucair.falabella.userinterfaces.FalabellaData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Completar implements Task {

    private FalabellaData falabellaData;

    public Completar(List<FalabellaDatos> falabellaDatos) {
        this.falabellaDatos = falabellaDatos;
    }

    List<FalabellaDatos> falabellaDatos;

    public static Completar formularioDatosPersonales(List<FalabellaDatos> falabellaDatos) {
        return Tasks.instrumented(Completar.class,falabellaDatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("Harold").into(falabellaData.NOMBRE),
                Enter.theValue("Altamiranda").into(falabellaData.APELLIDO),
                Enter.theValue("harold29as@gmail.com").into(falabellaData.CORREO),
                Enter.theValue("1052942912").into(falabellaData.CEDULA),
                Enter.theValue("3004639870").into(falabellaData.CELULAR)
               // Click.on(falabellaData.TERMINOS_CONDICIONES),
              //  Click.on(falabellaData.INGRESAR_ORDEN)
        );

    }
}
