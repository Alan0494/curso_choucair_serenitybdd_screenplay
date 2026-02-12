package pa.com.compra.serenity.cert.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src\\test\\resources\\features\\pagina_compra.feature"},
        glue = "pa.com.compra.serenity.cert.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@UserHistory=001"
)
public class CompraRunners {
}
