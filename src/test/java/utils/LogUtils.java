package utils;

public class LogUtils {
    /*
    passo 4 - Métodos para as informações de sucesso e erro
     */
    public void logInfo(String value) {
        if (!value.contains("{}")){
            ScenarioUtils.addText(value);
        }
    }

    public void logErrorU(String value) {
        if (!value.contains("{}")){
            ScenarioUtils.addText(value);
        }
    }

}
