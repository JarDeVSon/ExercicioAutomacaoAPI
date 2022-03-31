package utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
    /*
    PAsso 9 - Criar a classe dos arquivos de ambientes
    dev e hom
     */
    Properties properties = new Properties();

    public String getProperties(String key) {
        try {
            if (System.getProperty("env") == null ){
                properties.load(getClass().getClassLoader().getResourceAsStream("hom.properties"));
            } else {
                properties.load(getClass().getClassLoader().getResourceAsStream(System.getProperty("env")));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

}
