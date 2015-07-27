package Utilities;

import Amazon.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Bhaygashri on 18/07/2015.
 */
public class LoadProperties extends BasePage {

    static String fileLocation= "src/test/java/amazon.peroperties/";
    static String propertyFileName= "amazonTestData.properties";
    static Properties prop ;
    static FileInputStream input;

    public static String getProperty(String key){
        prop=new Properties();

        try{
            // giving property name amnd location
            input= new FileInputStream(propertyFileName + fileLocation);
            prop.load(input);
            input.close();

        }catch ( IOException e){
            e.printStackTrace();

        }

        return prop.getProperty(key);


    }



}
