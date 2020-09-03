package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsAllFiltersPage extends BasePage {

    public ElectronicsAllFiltersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getLowPrice() {
        return lowPrice;
    }

    @FindBy(xpath = "//input[@placeholder=\"3 845\"]")
    WebElement lowPrice;

    public WebElement getProducer() {
        return producer;
    }

    @FindBy(xpath = "//div[2]//div[2]/div[1]/div[5]//div[1]/input")
    WebElement producer;

    @FindBy(xpath = "//div[2]/div/label/div")
    WebElement firstProducer;

    @FindBy(xpath = "//section//div[3]//a[2]")
    WebElement showAllOffersButton;

    public void selectFirstProducer(){
        firstProducer.click();
    }

    public void clickShowAllOffersButton(){
        showAllOffersButton.click();
    }

}
