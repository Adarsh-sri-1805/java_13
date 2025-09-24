package UNIT3;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Properties;
public class File1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("db.properties");
        Properties prop = new Properties();
        prop.load(fr);
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("admin"));
    }
    //fix this
}
