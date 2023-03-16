package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.print.PrintOptions;
import utilities.PropertyManager;

public class CheckOutPage extends BasePage {

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    By firstNameFieldBy = By.id("first-name");

    By lastNameFieldBy = By.id("last-name");

    By zipCodeFieldBy = By.id("postal-code");

    By continueFieldBy = By.id("continue");

    public void writePersonalData (){
        writeText(firstNameFieldBy, PropertyManager.getInstance().getFirstName());
        writeText(lastNameFieldBy, PropertyManager.getInstance().getLastName());
        writeText(zipCodeFieldBy, PropertyManager.getInstance().getZipCode());
        clickElement(continueFieldBy);
    }





}
