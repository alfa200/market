package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;
import util.FileWriterReader;

import java.io.IOException;
import java.util.List;

public class TvPage extends BasePage {

    public TvPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public String firstArticleText;

    @FindBy(xpath = "//aside/div/div/div[3]/div/div/div[3]/div/div/a")
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

    public String getFirstArticleText() {
        return firstArticle.getText();
    }

    public void clickAllFiltersButton() {
        allFiltersButton.click();
    }

    public String readFirstArticleText() throws IOException {
        return FileWriterReader.readFromFile("FirstArticle");
    }

    public void setFirstArticleText() throws IOException {
        this.firstArticleText = firstArticle.getText();
        FileWriterReader.writeIntoFile("FirstArticle", firstArticle.getText());
    }


    public void pressSubmitButton() {
        submitButton.click();
    }

    public void checkElementsQuantity(String quantity){
        Assert.assertTrue(String.valueOf(article.size()).equals(quantity));
    }

    public void checkFounDTv() throws IOException {
        Assert.assertEquals(readFirstArticleText(), getFirstArticleText());
    }

}
