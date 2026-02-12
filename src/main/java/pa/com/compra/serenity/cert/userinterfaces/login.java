package pa.com.compra.serenity.cert.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class login {

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.id("user-name"));

    public static final Target CAMPO_CONTRASENA = Target.the("campo contraseña")
            .located(By.id("password"));

    public static final Target BOTON_INICIO_SESION = Target.the("botón login")
            .located(By.id("login-button"));



}
