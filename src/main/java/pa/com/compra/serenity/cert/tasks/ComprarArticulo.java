package pa.com.compra.serenity.cert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.compra.serenity.cert.userinterfaces.overproduction;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ComprarArticulo implements Task {

    public static ComprarArticulo Agregaryfinalizar(){

        return Tasks.instrumented(ComprarArticulo.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(overproduction.AddtoCart1, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Click.on(overproduction.AddtoCart1),
                WaitUntil.the(overproduction.AddtoCart2, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Click.on(overproduction.AddtoCart2),
                WaitUntil.the(overproduction.AddtoCart3, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Click.on(overproduction.AddtoCart3),
                WaitUntil.the(overproduction.AddtoCart4, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Click.on(overproduction.AddtoCart4),
                WaitUntil.the(overproduction.AddtoCart5, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Click.on(overproduction.AddtoCart5),
                WaitUntil.the(overproduction.Carrito, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Click.on(overproduction.Carrito),
                WaitUntil.the(overproduction.Checkout, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Click.on(overproduction.Checkout)
        );
    }
}
