package Pack_Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks
{
    @Before
    public static void startbrowser()
    {
        System.out.println("Open Browser");
    }

    @After
    public static void tearbrowser()
    {
        System.out.println("Close Browser");
    }
}
