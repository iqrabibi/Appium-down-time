package General;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;

public class Main
{
    @BeforeSuite
    public void beforeTest() throws MalformedURLException
    {
        webDriverFactory.startDriver();
    }

    @AfterMethod
    public void afterTest() throws MalformedURLException
    {
        webDriverFactory.finishDriver();
    }
}
