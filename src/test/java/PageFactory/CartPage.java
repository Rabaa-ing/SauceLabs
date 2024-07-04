package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @FindBy(id = "first-name")
    WebElement FirstName;
    @FindBy(id = "last-name")
    WebElement LastName;
    @FindBy(id = "postal-code")
    WebElement PostalCode;
    @FindBy(id = "continue")
    WebElement btnContinue;
    @FindBy(id = "finish")
    WebElement btnFinish;
    @FindBy(id = "react-burger-menu-btn")
    WebElement btnBurger;
    @FindBy(id = "logout_sidebar_link")
    WebElement btnLogout;
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void SaisirFirstName(String Firstname){
        FirstName.sendKeys("Rabaa");
    }
    public void SaisirLastName(String Lastname){
        LastName.sendKeys("Ibrahmi");
    }
    public void SaisirCodePostal(String Codepostal){
        PostalCode.sendKeys("2190");

    }
    public void Cliquer_Sur_Boutton_Continue(){
        btnContinue.click();
    }
    public void Cliquer_Sur_Boutton_Finish(){
        btnFinish.click();
    }
    public void Cliquer_Sur_Boutton_Burger(){
        btnBurger.click();
    }
    public void Cliquer_Sur_Boutton_Logout(){
        btnLogout.click();
    }

}
