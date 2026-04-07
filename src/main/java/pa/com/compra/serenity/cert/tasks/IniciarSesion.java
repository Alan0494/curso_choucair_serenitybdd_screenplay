package pa.com.compra.serenity.cert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.compra.serenity.cert.userinterfaces.LoginPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String contrasena;

    public IniciarSesion(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public static IniciarSesion conCredenciales(String usuario, String contrasena) {
        return instrumented(IniciarSesion.class, usuario, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(usuario).into(LoginPage.CAMPO_USUARIO),
                WaitUntil.the(LoginPage.CAMPO_CONTRASENA, isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Enter.theValue(contrasena).into(LoginPage.CAMPO_CONTRASENA),
                Click.on(LoginPage.BOTON_INICIO_SESION)

        );

    }

}
