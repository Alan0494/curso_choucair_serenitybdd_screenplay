package pa.com.compra.serenity.cert.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.compra.serenity.cert.userinterfaces.InformacionAdicional;

public class ValidarFinalizacionCompra implements Question<String> {


    public static ValidarFinalizacionCompra esVisible() {
        return new ValidarFinalizacionCompra();
    }

    @Override
    public String answeredBy(Actor actor) {
        return actor.asksFor(Text.of(InformacionAdicional.Thank_you));

    }
}

