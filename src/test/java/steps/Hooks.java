package steps;

import api.UtilsAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ScenarioUtils;

import java.util.HashMap;

public class Hooks extends UtilsAPI {
    /*
    Passo 8 - Criar o hooks de inicializacao
    e finalização dos cenarios de testes
     */
    @Before
    public void before(Scenario scenario){
        ScenarioUtils.add(scenario);
        headers = new HashMap<>();
        params = new HashMap<>();
    }
    @After
    public void after(){
        ScenarioUtils.remove();
    }
}
