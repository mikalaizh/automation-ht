import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 2/25/2017.
 */
public class LitecartAdminLogin extends BaseTest{

    @Test
    public void adminLogin(){
        WebElement loginAdmin = driver.findElement(By.xpath("//input[contains(@name, 'username')]"));
        WebElement passAdmin = driver.findElement(By.xpath("//input[contains(@name, 'password')]"));
        WebElement loginBTN = driver.findElement(By.xpath("//button[contains(@name, 'login')]"));

        loginAdmin.sendKeys("admin");
        passAdmin.sendKeys("admin");
        loginBTN.click();
    }

}
