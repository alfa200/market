package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import steps.BaseSteps;

import java.util.ArrayList;
import java.util.List;

public class TvPage extends BasePage {

    public TvPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//aside/div/div/div[3]/div/div/div[3]/div/div/a")
    WebElement allFiltersButton;

    @FindBy(xpath = "//div[2]/div[5]/div[6]/div/div[1]/div/div/div/article")
    List<WebElement> article;


    public List<WebElement> getArticle() {
        System.out.println("dsfsdfsdfsdfsdf" + article.size());
        return article;
    }

    @Step("sdfdsf")
    public void refresh(){
        BaseSteps.getDriver().navigate().refresh();
    }

    public void clickAllFiltersButton() {
        allFiltersButton.click();
    }


}
