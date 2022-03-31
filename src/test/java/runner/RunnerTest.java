package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Passo 7 - Criar a suite de execução de testes
 */
@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src/test/resources/features",
        glue = "steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"html:target/report.html"},
        publish = true,
        tags = "@post"
)
public class RunnerTest {
}
