package api;

import utils.PropertiesUtils;

import java.util.HashMap;
import java.util.Map;

public class HeaderAPI {
/*
Passo 10 - Criar um mapa com os valores do Headers
 */
    Map<String, String> headers = new HashMap<>();

    public Map<String,String> gorestHeaders(String token){
        headers.put("Accept","application/json");
        headers.put("Content-Type","application/json");
        headers.put("Authorization", token);
        return headers;
    }
}
