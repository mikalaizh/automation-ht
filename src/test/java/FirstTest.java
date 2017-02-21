import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



/**
 * Created by user on 2/21/2017.
 */
public class FirstTest extends BaseTest {

    @Test
    public void login(){
        WebElement usernameField = driver.findElement(By.xpath("//input[contains(@id, 'email')]"));
        WebElement passField = driver.findElement(By.xpath("//input[contains(@id, 'pass')]"));
        WebElement loginBTN = driver.findElement(By.xpath("//input[contains(@value, 'Log In')]"));

        usernameField.sendKeys("user");
        passField.sendKeys("pass");
        loginBTN.click();


    }

}
