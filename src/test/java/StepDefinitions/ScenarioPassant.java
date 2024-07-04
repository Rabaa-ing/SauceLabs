package StepDefinitions;

import PageFactory.CartPage;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.ElementsUtils;

import java.util.ArrayList;
import java.util.List;


public class ScenarioPassant {
    WebDriver driver;
    LoginPage Login;
    HomePage Home;
    CartPage Cart;
    ElementsUtils methode;
    @Given("Je me rends sur le site SwagLabs")
    public void je_me_rends_sur_le_site_swag_labs() {
        driver =new ChromeDriver();
        Login = new LoginPage(driver);
        Home = new HomePage(driver);
        Cart = new CartPage(driver);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


    }
    @When("Je saisie le username")
    public void je_saisie_le_username() {
        Login.SaisirUserName("standard_user");

    }
    @And("Je saisie le password")
    public void je_saisie_le_password() {
       Login.SaisirPassword("secret_sauce");

    }
    @And("Je clique sur le bouton Login")
    public void je_clique_sur_le_bouton_login() {
        Login.Cliquer_Sur_Boutton_Login();
    }
    @Then("La page des produit s affichent")
    public void la_page_des_produit_s_affichent() throws InterruptedException {
        Thread.sleep(3000);
        methode = new ElementsUtils(driver);
        methode.Configuration("https://www.saucedemo.com/inventory.html");

    }
    @And("Je clique sur le bouton Add to cart du produit BackPack")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_back_pack() {
        Home.Cliquer_Sur_Boutton_BackPack();

    }
    @And("Je clique sur le bouton Add to cart du produit T-Shirt")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_t_shirt() {
        Home.Cliquer_Sur_Boutton_T_Shirt();

    }
    @Then("Les produit s ajoutent dans le panier")
    public void les_produit_s_ajoutent_dans_le_panier() throws InterruptedException {
        Thread.sleep(3000);
        methode = new ElementsUtils(driver);
        methode.recherche("Remove");

    }
    @And("Je clique sur l icone panier")
    public void je_clique_sur_l_icone_panier() {
        Home.Cliquer_Sur_Boutton_Panier();

    }
    @And("Je clique sur le bouton remove")
    public void je_clique_sur_le_bouton_remove() {
        Home.Cliquer_Sur_Boutton_Remove();

    }
    @Then("Le produit sera supprimé du panier")
    public void le_produit_sera_supprimé_du_panier() throws InterruptedException {
        Thread.sleep(3000);
        methode = new ElementsUtils(driver);
        methode.recherche("Sauce Labs Bolt T-Shirt");

    }
    @And("Je clique sur le bouton checkout")
    public void je_clique_sur_le_bouton_checkout() {
        Home.Cliquer_Sur_Boutton_Checkout();

    }

    @And("Je rempli le username")
    public void je_rempli_le_username() {
        Cart.SaisirFirstName("Rabaa");

    }

    @And("Je saisie le lastname")
    public void je_saisie_le_lastname() {
        Cart.SaisirLastName("Ibrahmi");


    }

    @And("Je saisie le code postal")
    public void je_saisie_le_code_postal() {
        Cart.SaisirCodePostal("2190");

    }

    @And("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() {
        Cart.Cliquer_Sur_Boutton_Continue();

    }

    @Then("une page overview s affiche")
    public void une_page_overview_s_affiche() throws InterruptedException {
        Thread.sleep(3000);
        methode = new ElementsUtils(driver);
        methode.Configuration("https://www.saucedemo.com/checkout-step-two.html");

    }

    @And("je clique sur le bouton finish")
    public void je_clique_sur_le_bouton_finish() {
        Cart.Cliquer_Sur_Boutton_Finish();
    }

    @Then("une page Checkout:Complete s affiche")
    public void une_page_checkout_complete_s_affiche() throws InterruptedException {
        Thread.sleep(3000);
        methode = new ElementsUtils(driver);
        methode.Configuration("https://www.saucedemo.com/checkout-complete.html");
    }
    @And("Je clique sur le menu burger")
    public void je_clique_sur_le_menu_burger() throws InterruptedException {
       Cart.Cliquer_Sur_Boutton_Burger();
        Thread.sleep(3000);

    }

    @And("Je clique surle bouton Logout")
    public void je_clique_surle_bouton_logout() throws InterruptedException {


        Cart.Cliquer_Sur_Boutton_Logout();


    }

    @Then("Je me redirige vers la page d authentification {string}")
    public void je_me_redirige_vers_la_page_d_authentification(String string) throws InterruptedException {
        Thread.sleep(3000);
        methode = new ElementsUtils(driver);
        methode.Configuration("https://www.saucedemo.com/");

    }



}
