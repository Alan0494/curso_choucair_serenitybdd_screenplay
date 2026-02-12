package pa.com.compra.serenity.cert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.compra.serenity.cert.userinterfaces.InformacionAdicional;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class InformacionDeUsuario implements Task {

    public static InformacionDeUsuario detalles() {
        return instrumented(InformacionDeUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
        WaitUntil.the(InformacionAdicional.FIRST_NAME, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Enter.theValue("Alan").into(InformacionAdicional.FIRST_NAME),

        WaitUntil.the(InformacionAdicional.LAST_NAME, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Enter.theValue("Diaz").into(InformacionAdicional.LAST_NAME),

        WaitUntil.the(InformacionAdicional.POSTAL_CODE, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Enter.theValue("0419").into(InformacionAdicional.POSTAL_CODE),

                Click.on(InformacionAdicional.BOTON_CONTINUE),
                Click.on(InformacionAdicional.BOTON_FINISH)


        );
    }
}


