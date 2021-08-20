import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class HomePage {
    @FindBy(xpath = "//span[contains(.,'Projects')]")
    WebElement projects;
    @FindBy(xpath = "//span[contains(.,'Employees')]")
    WebElement employees;
    @FindBy(xpath = "//span[contains(.,'Logout')]")
    WebElement logout;
    @FindBy(xpath = "//span[@class='material-icons'][contains(.,'add')]")
    WebElement addProject;
    @FindBy(xpath = "//span[contains(.,'Cancel')]")
    WebElement cancelProject;
    @FindBy(xpath = "//span[@class='material-icons']")
    WebElement addEmployees;
    @FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Cancel')]")
    WebElement cancelEmployees;
    WebDriver driver;

    HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
