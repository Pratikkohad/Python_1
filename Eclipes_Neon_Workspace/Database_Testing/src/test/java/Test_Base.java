

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Test_Base
{
    public  static Properties prop;

    public Test_Base()
    {
        try
        {
            prop = new Properties();
            String Config_path= "D:\\Eclipes_Neon_Workspace\\Database_Testing\\src\\test\\Configuration\\Config.properties";
            FileInputStream fis = new FileInputStream(Config_path);

            prop.load(fis);


        }
        catch (IOException e)
        {
            e.getMessage();
        }
    }


    }


