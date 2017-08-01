package Task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.FileNameMap;
import java.util.Properties;


public class UniversClass {
    public void getKey(String fileName) throws Exception {
        Properties properties = new Properties();
        try {
            FileInputStream fIs = new FileInputStream(fileName);
            properties.load(fIs);
            String key = properties.getProperty("key1");
            if (key == null)
                throw new Exception("Properties have not this key");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.print(e);
        }catch (Exception e) {
            System.out.print(e);
        }
    }

    public static void main(String[] args) throws Exception {
        String file= "C:\\Users\\Users\\Users\\exeptions\\src\\main\\resources\\Task2";
        UniversClass uC=new UniversClass();
        uC.getKey(file);
    }

}
