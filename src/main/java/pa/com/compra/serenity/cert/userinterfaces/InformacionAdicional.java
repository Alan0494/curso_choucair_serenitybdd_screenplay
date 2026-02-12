package pa.com.compra.serenity.cert.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionAdicional {

    public static final Target FIRST_NAME = Target.the("campo de nombre")
            .located(By.id("first-name"));


    public static final Target LAST_NAME = Target.the("campo de apellido")
            .located(By.id("last-name"));

    public static final Target POSTAL_CODE = Target.the("campo de codigo postal")
            .located(By.id("postal-code"));

    public static final Target BOTON_CONTINUE = Target.the("boton de continuar")
            .located(By.id("continue"));
    public static final Target BOTON_FINISH = Target.the("boton de finalizar")
            .located(By.id("finish"));

    public static final Target Thank_you = Target.the("Thank you for your order!")
            .locatedBy("//div[@class=\"checkout_complete_container\"]//h2");
}
