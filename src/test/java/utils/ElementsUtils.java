package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ElementsUtils {
    WebDriver driver;
    public ElementsUtils(WebDriver driver){
        this.driver = driver;
    }
    public void  Configuration(String lien){
        String actualurl = lien;
        String expecturl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl,expecturl);
    }
    public void recherche(String message){
        String pagecontent1 = driver.findElement(By.tagName("html")).getText();
        List<String> motrechrche1 = new ArrayList<>();
        motrechrche1.add(message);
        for (String mot : motrechrche1) {
            if (pagecontent1.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            } else {
                System.out.println("le mot " + mot + " n'existe pas sur la page");
            }

        }
    }
}
