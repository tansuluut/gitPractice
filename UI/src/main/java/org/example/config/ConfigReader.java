package org.example.config;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private  static Properties properties; //для расширения .properties

    static {   //static block
        try {
            String path = "C:\\Users\\Honor\\Desktop\\projectHtml\\SummerSDET2023\\UI\\src\\main\\resources\\config.properties";
            FileInputStream inputStream = new FileInputStream(path); // доступ файл поток, чтоб оьбект мог взять данные
            properties = new Properties();// объект этого класса
            properties.load(inputStream);// загружает в этот класс все данные
            inputStream.close();
        }catch (IOException e){ // input out put
            e.printStackTrace(); // распечатали ошибку в случае чего
        }
    }

    public static String getProperty(String key){//наш метод
        return properties.getProperty(key).trim();
    }

}
