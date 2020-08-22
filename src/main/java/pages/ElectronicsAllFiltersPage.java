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

    @FindBy(xpath = "//section/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/input")
    WebElement lowPrice;

    public WebElement getProducer() {
        return producer;
    }

    @FindBy(xpath = "//section/div[2]/div/div/div[2]/div[1]/div[5]/div/div/div/div[1]/input")
    WebElement producer;

    @FindBy(xpath = "//section/div[2]/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/div/label/div")
    WebElement firstProducer;

    @FindBy(xpath = "//section/div[2]/div/div/div[3]/div/div/a[2]")
    WebElement showAllOffersButton;

    public void selectFirstProducer(){
        firstProducer.click();
    }

    public void clickShowAllOffersButton(){
        showAllOffersButton.click();
    }

}
