package pa.com.compra.serenity.cert.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import pa.com.compra.serenity.cert.questions.ValidarFinalizacionCompra;
import pa.com.compra.serenity.cert.tasks.AbrirNavegador;
import pa.com.compra.serenity.cert.tasks.ComprarArticulo;
import pa.com.compra.serenity.cert.tasks.InformacionDeUsuario;
import pa.com.compra.serenity.cert.tasks.IniciarSesion;



import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class SwagLabStepdefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("actor");
    }


    @Dado("que Alan abre la página de SauceDemo")
    public void queAlanAbreLaPaginaDeSauceDemo() {

        OnStage.theActor("actor").wasAbleTo(AbrirNavegador.paginaPrincipal());
    }

    @Cuando("inicia sesión con usuario {string} y contraseña {string}")
    public void iniciaSesionConUsuarioYContrasena(String usuario, String contrasena) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(usuario, contrasena)

        );

    }

    @Cuando("agrega 5 producto al carrito y finaliza la compra")
    public void agrega5ProductoAlCarritoYFinalizaLaCompra() {

        OnStage.theActor("actor").attemptsTo(ComprarArticulo.Agregaryfinalizar());
        OnStage.theActor("actor").attemptsTo(InformacionDeUsuario.detalles());

    }

    @Entonces("debería ver el mensaje {string}")
    public void deberiaVerElMensaje(String mensaje) {

        OnStage.theActor("actor").should(
                seeThat(ValidarFinalizacionCompra.esVisible(), Matchers.equalTo(mensaje))
        );
    }

}
