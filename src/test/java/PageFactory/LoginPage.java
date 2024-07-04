package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "user-name")
    WebElement champsUserName;
    @FindBy(id = "password")
    WebElement champsPassword;
    @FindBy(id="login-button")
    WebElement btnLogin;
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SaisirUserName(String UserName) {
        champsUserName.sendKeys(UserName);
    }
    public void SaisirPassword(String Password){
        champsPassword.sendKeys(Password);
    }
    public void Cliquer_Sur_Boutton_Login(){
        btnLogin.click();
    }
}
