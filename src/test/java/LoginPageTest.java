import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
    public WebDriver driver;
    private LoginPage loginPage;
    String baseUrl="http://localhost:4200";
    @BeforeTest
    public void initialSetUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver=new ChromeDriver();
        driver.get(baseUrl);
        loginPage=new LoginPage(driver);
    }

    @Test
    public void testLoginWithValidUsernameAndPassword(){
        loginPage.getUsername().sendKeys("AdminOne");
        loginPage.getPassword().sendKeys("PasswordOne");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.getLoginButton().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String currentUrl=driver.getCurrentUrl();
        String expectedUrl="http://localhost:4200/projects";
        Assert.assertEquals(expectedUrl,currentUrl);
    }
    @AfterTest
    public void closeDriver(){
        driver.close();
    }

}
