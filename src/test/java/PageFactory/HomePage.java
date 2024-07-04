package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement btnProduit_T_Shirt;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement btnPackPack;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement btnPanier;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement btnRemove;
    @FindBy(id = "checkout")
    WebElement btnCheckout;
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void Cliquer_Sur_Boutton_T_Shirt(){
        btnProduit_T_Shirt.click();
    }
    public void Cliquer_Sur_Boutton_BackPack(){
        btnPackPack.click();
    }
    public void Cliquer_Sur_Boutton_Panier(){
        btnPanier.click();
    }
    public void Cliquer_Sur_Boutton_Remove(){
        btnRemove.click();
    }
    public void Cliquer_Sur_Boutton_Checkout(){
        btnCheckout.click();
    }
}
