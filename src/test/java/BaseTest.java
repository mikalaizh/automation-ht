import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by user on 2/21/2017.
 */
public class BaseTest {

    public WebDriver driver;
    public String baseURL;



    @Before
    public void setUp(){

        //System.setProperty("webdriver.chrome.driver", "D:\\QA\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        baseURL = "http://localhost/litecart/admin/";
        driver.get(baseURL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
