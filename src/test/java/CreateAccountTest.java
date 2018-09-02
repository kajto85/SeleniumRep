import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateAccountTest {

    WebDriver driver1;
    String baseUrl1 = "http://automationpractice.com/index.php";

    @Test
    public void setUrl() {
        WebDriverManager.firefoxdriver().setup();
        driver1 = new FirefoxDriver();
        driver1.get(baseUrl1);
        driver1.findElement(By.className("login")).click();
        driver1.findElement(By.id("email_create")).sendKeys("sitarskim@gmail.com");
        driver1.findElement(By.id("SubmitCreate")).click();






    }
}
