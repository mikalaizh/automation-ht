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
        // I defined this folder in PATH, but for some reason it still did not see chromedriver
        System.setProperty("webdriver.chrome.driver", "D:\\QA\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        baseURL = "https://www.facebook.com/";
        driver.get(baseURL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
