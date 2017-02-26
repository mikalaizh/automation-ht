import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by user on 2/21/2017.
 */
public class BaseTest {

    public WebDriver driver;
    public String baseURL;



    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "http://localhost/litecart/admin/";
        driver.get(baseURL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
