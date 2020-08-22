package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends BasePage{

    public ElectronicsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(linkText = "Телевизоры")
    WebElement tvLink;

    public void selectTvLink(){
        tvLink.click();
    }

    @FindBy(linkText = "Наушники и Bluetooth-гарнитуры")
    WebElement headphonesLink;

    public void selectHeadphonesLink(){
        headphonesLink.click();
    }

}
