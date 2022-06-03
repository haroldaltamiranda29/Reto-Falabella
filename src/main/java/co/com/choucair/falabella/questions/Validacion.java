package co.com.choucair.falabella.questions;

import co.com.choucair.falabella.userinterfaces.FalabellaData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validacion implements Question<Boolean> {

    private FalabellaData falabellaData;

    private String question;

    public Validacion(String question) {

        this.question = question;
    }

    public static Validacion mensaje(String question) {

        return new Validacion(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String mensaje = Text.of(falabellaData.INGRESAR_ORDEN).viewedBy(actor).asString();
        System.out.println("Mensaje capturado en la validacion: " + mensaje);
        if (question.equals(mensaje)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
