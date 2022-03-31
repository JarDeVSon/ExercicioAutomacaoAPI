package steps;

import api.HeaderAPI;
import api.RequestAPI;
import com.github.javafaker.Faker;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import user.UsersClass;
import utils.JsonUtils;
import utils.PropertiesUtils;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GorestSteps extends RequestAPI {

    /*
    Passo 11 - Implementar os métodos do cucumber
     */
    PropertiesUtils propertiesUtils = new PropertiesUtils();
    JsonUtils jsonUtils = new JsonUtils();
    HeaderAPI headerAPI = new HeaderAPI();
    Faker faker = new Faker();

    @Dado("que possuo um token valido")
    public void quePossuoUmTokenValido() {
        /*
        1) Primeiro pegar o token
         */
        token = propertiesUtils.getProperties("token_gorest");
    }
    @Quando("envio um request de cadastro de usuario com dados validos")
    public void envioUmRequestDeCadastroDeUsuarioComDadosValidos() throws IOException {
        /*
        2) Pegar a uri(URL)
         */
        super.uri = propertiesUtils.getProperties("uri_gorest");
        /*
        3) Pegar o Header
         */
        super.headers = headerAPI.gorestHeaders(token);
        /*
        4) Informar o body com todas as informacoes
         */
       // super.body = jsonUtils.parseJSON();
        super.body = new UsersClass(
                faker.internet().emailAddress(),
                "Female",faker.name().fullName(),
                "Active").getJson();
        /*

        5) Realizar a requisicao
         */

        super.POST();
    }
    @Entao("o usuario deve ser criado corretamente")
    public void oUsuarioDeveSerCriadoCorretamente() {
        /*
        6) Validar a resposta recebida (Validar o payload)
         */
        assertEquals(body.getString("email"), response.jsonPath().getString("data.email"));
    }
    @Entao("o status code do request deve ser {int}")
    public void oStatusCodeDoRequestDeveSer(Integer statusCode) {
        /*
        7) Validar o status code
         */
        assertEquals(statusCode, response.statusCode());
    }

}