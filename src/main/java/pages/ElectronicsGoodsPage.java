package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class ElectronicsGoodsPage extends BasePage {

    public ElectronicsGoodsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public static String firstArticleText;

    @FindBy(xpath = "//div[@data-zone-name='all-filters-button']//a")
    WebElement allFiltersButton;

    @FindBy(xpath = "//div[@data-zone-name='SearchResults']//article")
    List<WebElement> article;

    @FindBy(xpath = "//div[@data-zone-name='SearchResults']//article[1]//h3/a")
    WebElement firstArticle;

    @FindBy(id = "header-search")
    WebElement headerSearch;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    public WebElement getHeaderSearch() {
        return headerSearch;
    }

    public List<WebElement> getArticle() {
        return article;
    }


    public void clickAllFiltersButton() {
        allFiltersButton.click();
    }

    public String getFirstArticleText() {
        return firstArticleText;
    }

    public void setFirstArticleText() {
        this.firstArticleText = firstArticle.getText();
    }


    public void pressSubmitButton() {
        submitButton.click();
    }

    public void checkElementsQuantity(String quantity){
        Assert.assertTrue(String.valueOf(article.size()).equals(quantity));
    }

    public void checkFounDTv() {
        Assert.assertEquals(getFirstArticleText(), firstArticle.getText());
    }

}
