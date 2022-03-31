package api;

import utils.LogUtils;

import static io.restassured.RestAssured.given;

public class RequestAPI extends UtilsAPI implements VerbosAPI {
   /*
   Passo 6 - Implementar as chamadas da API ou seja,
   todas as Requests
    */

    @Override
    public void GET() {
        /*
        O GET Não precisa de Body ou seja, enviar o corpo da requisicao
         */
        response = given()
                .log().all()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .get(uri)
                .thenReturn();
        super.log("GET");
    }

    @Override
    public void POST() {
        /*
        NO POST é preciso enviar o body ou corpo da requisicao
         */
        response = given()
                .log().all()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .post(uri)
                .thenReturn();
        super.log("POST");
    }

    @Override
    public void PUT() {
        response = given()
                .log().all()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .put(uri)
                .thenReturn();
        super.log("PUT");
    }

    @Override
    public void PATCH() {
        response = given()
                .log().all()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .patch(uri)
                .thenReturn();
        super.log("PATCH");
    }

    @Override
    public void DELETE() {
        response = given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .delete(uri)
                .thenReturn();
        super.log("DELETE");
    }


}
