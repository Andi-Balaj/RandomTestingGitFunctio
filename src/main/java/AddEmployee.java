import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class AddEmployee {
    @FindBy(xpath = "//span[contains(.,'Employees')]")
    WebElement employeesButton;
    @FindBy(xpath = "//span[@class='material-icons'][contains(.,'add')]")
    WebElement addEmployees;
    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c72-54'][contains(.,'Name')]")
    WebElement name;
    @FindBy(xpath = "//input[contains(@id,'mat-input-3')]")
    WebElement email;
    @FindBy(xpath = "//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c116-197 ng-star-inserted']")
    WebElement internalPosition;



    WebDriver driver;
    AddEmployee(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
